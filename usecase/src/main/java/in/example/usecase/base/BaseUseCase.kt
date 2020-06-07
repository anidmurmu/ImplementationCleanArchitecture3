package `in`.example.usecase.base

public interface UseCase<P> {
    interface Callback {
        fun onSuccess()
        fun onError(throwable: Throwable)
    }
    fun execute(parameter: P, callBack: Callback)
}