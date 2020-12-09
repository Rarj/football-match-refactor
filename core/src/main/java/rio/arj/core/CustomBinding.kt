package rio.arj.core

import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

object CustomBinding {

  @JvmStatic
  @BindingAdapter("app:imageUrl")
  fun setImageWithUrl(view: AppCompatImageView, url: String?) {
    url?.let {
      Glide.with(view.context)
        .load(url)
        .into(view)
    }
  }

}