package br.com.rperatello.booklist

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Book (val title: String,
                 val isbn: String,
                 val firstAuthor: String,
                 val publishingCompany: String,
                 val edition: Int,
                 val page: Int
): Parcelable