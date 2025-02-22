// Generated by view binder compiler. Do not edit!
package com.example.projeto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.projeto.R;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RecyclerItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView recCard;

  @NonNull
  public final TextView recDesc;

  @NonNull
  public final ShapeableImageView recImage;

  @NonNull
  public final TextView recPriority;

  @NonNull
  public final TextView recTitle;

  private RecyclerItemBinding(@NonNull CardView rootView, @NonNull CardView recCard,
      @NonNull TextView recDesc, @NonNull ShapeableImageView recImage,
      @NonNull TextView recPriority, @NonNull TextView recTitle) {
    this.rootView = rootView;
    this.recCard = recCard;
    this.recDesc = recDesc;
    this.recImage = recImage;
    this.recPriority = recPriority;
    this.recTitle = recTitle;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static RecyclerItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RecyclerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.recycler_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RecyclerItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView recCard = (CardView) rootView;

      id = R.id.recDesc;
      TextView recDesc = ViewBindings.findChildViewById(rootView, id);
      if (recDesc == null) {
        break missingId;
      }

      id = R.id.recImage;
      ShapeableImageView recImage = ViewBindings.findChildViewById(rootView, id);
      if (recImage == null) {
        break missingId;
      }

      id = R.id.recPriority;
      TextView recPriority = ViewBindings.findChildViewById(rootView, id);
      if (recPriority == null) {
        break missingId;
      }

      id = R.id.recTitle;
      TextView recTitle = ViewBindings.findChildViewById(rootView, id);
      if (recTitle == null) {
        break missingId;
      }

      return new RecyclerItemBinding((CardView) rootView, recCard, recDesc, recImage, recPriority,
          recTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
