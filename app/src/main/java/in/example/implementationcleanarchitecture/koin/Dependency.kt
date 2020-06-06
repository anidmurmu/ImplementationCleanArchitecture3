package `in`.example.implementationcleanarchitecture.koin

import `in`.example.implementationcleanarchitecture.presentation.WordViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

  viewModel {
    WordViewModel(
      get()
    )
  }
}