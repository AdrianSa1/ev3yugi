package com.adrian.ec3.santiago.ui.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adrian.ec3.santiago.databinding.ItemNoteBinding
import com.adrian.ec3.santiago.model.Card
import com.bumptech.glide.Glide

class RVYugiListAdapter (var cards: List<Card>): RecyclerView.Adapter<NoteVH>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteVH {
        val binding = ItemNoteBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NoteVH(binding)
    }

    override fun getItemCount(): Int = cards.size

    override fun onBindViewHolder(holder: NoteVH, position: Int) {
        holder.bind(cards[position])
    }

}

class NoteVH(private val binding: ItemNoteBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(card: Card) {
        binding.txtNoteTitle.text = card.name
        binding.txtContentNote.text = card.type
        binding.txtLablesNote.text = card.attribute
        binding.txtCreateNote.text = card.race

        val imageUrl = card.card_images[0].image_url
        Glide.with(binding.root.context)
            .load(imageUrl)
            .into(binding.imageView)

    }

}