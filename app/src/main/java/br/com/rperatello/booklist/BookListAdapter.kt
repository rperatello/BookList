package br.com.rperatello.booklist

import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import br.com.rperatello.booklist.databinding.BookLayoutBinding
import java.security.AccessControlContext

class BookListAdapter(private val activity: MainActivity, resource: Int, bookList: ArrayList<Book>):
        ArrayAdapter<Book>(activity, resource, bookList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView;
        val book = getItem(position)
        if(convertView == null) {
            val bookLayoutBiding = BookLayoutBinding.inflate(activity.LayoutInflater)
            view = bookLayoutBiding.root
            val bookHolder = BookHolder(
                    bookLayoutBiding.titleTv,
                    bookLayoutBiding.firstAuthorTv,
                    bookLayoutBiding.publishingCompanyTv
            )
            view.tag = bookHolder
        }
        (view?.tag as BookHolder).titleTv.text = book?.title
        (view?.tag as BookHolder).firstAuthorTv.text = book?.firstAuthor
        (view?.tag as BookHolder).publishingCompanyTv.text = book?.publishingCompany

        return view
    }

    private data class BookHolder(
            val titleTv: TextView,
            val firstAuthorTv: TextView,
            val publishingCompanyTv: TextView
    )

}