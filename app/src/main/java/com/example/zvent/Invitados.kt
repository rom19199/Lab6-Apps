package com.example.zvent

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.invitados_fragment.*


class Invitados : Fragment() {

    companion object {
        fun newInstance() = Invitados()
    }

    private lateinit var viewModel: InvitadosViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.invitados_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(InvitadosViewModel::class.java)
        // TODO: Use the ViewModel

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn6.setOnClickListener(){
            findNavController().navigate(R.id.personas4)
        }
        btn7.setOnClickListener(){
            findNavController().navigate(R.id.personas4)
        }
    }

}
