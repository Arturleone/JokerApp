package com.example.jokeapp.view

import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.example.jokeapp.model.Category
import com.xwray.groupie.Item
import com.xwray.groupie.GroupieViewHolder
import com.example.jokeapp.R

class CategoryItem (private val category: Category): Item<CategoryItem.CategoryViewHolder>() {

    override fun createViewHolder(itemView: View) = CategoryViewHolder(itemView)

    class CategoryViewHolder(view: View) : GroupieViewHolder(view)

    override fun bind(viewHolder: CategoryViewHolder, position: Int) {
        viewHolder.itemView.findViewById<TextView>(R.id.txt_category).text = category.name
        viewHolder.itemView.findViewById<LinearLayout>(R.id.container_category).setBackgroundColor(category.bgColor.toInt())
    }

    override fun getLayout() = R.layout.item_category

}