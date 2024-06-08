package com.marisma.fase1recu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.marisma.fase1recu.databinding.FragmentStartBinding

class StartFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentStartBinding.inflate(inflater, container, false)

        // Configuramos el botón "Comenzar"
        binding.startButton.setOnClickListener {
            // Navegar al menú principal
            findNavController().navigate(R.id.action_startFragment_to_menuFragment)
        }

        return binding.root
    }
}