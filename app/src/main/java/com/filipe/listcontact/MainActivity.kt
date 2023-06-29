package com.filipe.listcontact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.filipe.listcontact.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), ListAdapter.ListAdapterListener{

    private lateinit var binding: ActivityMainBinding
    private var itemList: MutableList<ContactInfo> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)



        val listView = binding.lista

        createMockData()

        listView.layoutManager = LinearLayoutManager(this)
        listView.adapter = ListAdapter(itemList, this)
    }

    private fun createMockData(){
        itemList.add(ContactInfo("Filipe Cesar","(81)99862-8525"))
        itemList.add(ContactInfo("Fernando Galvao","(81)98868-7854"))
        itemList.add(ContactInfo("Danilo Gara","(81)97852-7852"))
        itemList.add(ContactInfo("Elaine Cristina","(81)98952-8058"))
        itemList.add(ContactInfo("Tiago Bacha","(81)99787-8584"))
        itemList.add(ContactInfo("Dyanne Evellyn","(81)99562-6935"))
        itemList.add(ContactInfo("Wildson Santos","(81)98748-4587"))
        itemList.add(ContactInfo("Tatiane Marques","(81)97225-0025"))
        itemList.add(ContactInfo("Pedro Henrique","(81)99862-8525"))
        itemList.add(ContactInfo("Gustavo Rosas","(81)98868-7854"))
        itemList.add(ContactInfo("Patricia Melo","(81)97852-7852"))
        itemList.add(ContactInfo("Lorena Felix","(81)98952-8058"))
        itemList.add(ContactInfo("Guilherme Perreira","(81)99787-8584"))
        itemList.add(ContactInfo("Maria Gabriela","(81)99562-6935"))
        itemList.add(ContactInfo("Maria das Dores","(81)98748-4587"))
        itemList.add(ContactInfo("Gabreila Souza","(81)97225-0025"))
        itemList.add(ContactInfo("Polliane Felix","(81)99862-8525"))
        itemList.add(ContactInfo("Maria Eduarda","(81)8868-7854"))
        itemList.add(ContactInfo("Marksuel Lima","(81)97852-7852"))
        itemList.add(ContactInfo("Samara Beatriz","(81)98952-8058"))
        itemList.add(ContactInfo("Victor Batista","(81)99787-8584"))
        itemList.add(ContactInfo("Matheus Fereira","(81)99562-6935"))
        itemList.add(ContactInfo("Matheus Ribeiro","(81)98748-4587"))
        itemList.add(ContactInfo("David Evangelista","(81)97225-0025"))
        itemList.add(ContactInfo("Joao Victor","(81)99862-8525"))
        itemList.add(ContactInfo("Thays Prisscila","(81)98868-7854"))
        itemList.add(ContactInfo("Priscila Ferreira","(81)97852-7852"))
        itemList.add(ContactInfo("Decio Junior","(81)98952-8058"))
        itemList.add(ContactInfo("Jhonathan Rafael","(81)99787-8584"))
        itemList.add(ContactInfo("Samuel Silva","(81)99562-6935"))
        itemList.add(ContactInfo("Nelia Oliveira","(81)98748-4587"))
        itemList.add(ContactInfo("Jorge Gomes","(81)97225-0025"))
        itemList.add(ContactInfo("Igor Silva","(81)99862-8525"))
        itemList.add(ContactInfo("Lira jr.","(81)98868-7854"))
        itemList.add(ContactInfo("Marcos Fernando","(81)97852-7852"))
        itemList.add(ContactInfo("Paulo Fernando","(81)98952-8058"))
        itemList.add(ContactInfo("Yuri Antunes","(81)99787-8584"))
        itemList.add(ContactInfo("Yago Gouveia","(81)99562-6935"))
        itemList.add(ContactInfo("Saulo Oliveira","(81)98748-4587"))
        itemList.add(ContactInfo("Igor Albuquerque","(81)97225-0025"))
    }

    override fun onItemClicked(content: String) {
        Snackbar.make(binding.root,content,Snackbar.LENGTH_SHORT).show()
    }
}