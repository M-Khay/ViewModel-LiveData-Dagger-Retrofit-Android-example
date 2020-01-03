package com.example.viewmodellivedatadaggerretrofit.species

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.viewmodellivedatadaggerretrofit.R
import com.example.viewmodellivedatadaggerretrofit.di.ComponentInjector
import com.example.viewmodellivedatadaggerretrofit.model.Species
import kotlinx.android.synthetic.main.activity_species.*

class SpeciesActivity : AppCompatActivity() {

    private lateinit var viewModel: SpeciesListViewModel
    private lateinit var adapter: SpeciesListAdapter

    private lateinit var progressBar: ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_species)
        setSupportActionBar(findViewById(R.id.toolbar))
        progressBar = findViewById(R.id.progressBar)
        title = "StartWar Species"
        viewModel = createViewModel()
        viewModel.getSpecies()
        adapter = SpeciesListAdapter(viewModel)

        rvSpecies.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@SpeciesActivity)
            adapter = this@SpeciesActivity.adapter
        }

        viewModel.speciesResponse.observe(this, Observer<List<Species>> {
            it?.let { adapter.notifyDataSetChanged() }
        })
    }

    private fun createViewModel(): SpeciesListViewModel =
        ViewModelProviders.of(this).get(SpeciesListViewModel::class.java).also {
            ComponentInjector.component.inject(it)

        }

    private fun showLoadingDialog(show: Boolean) {
        if (show) progressBar.visibility = View.VISIBLE else progressBar.visibility = View.GONE
    }

}