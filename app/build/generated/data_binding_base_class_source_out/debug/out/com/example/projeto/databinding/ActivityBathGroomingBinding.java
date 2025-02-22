// Generated by view binder compiler. Do not edit!
package com.example.projeto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.projeto.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityBathGroomingBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final AutoCompleteTextView agendaBanhoTosa;

  @NonNull
  public final TextView agendamento;

  @NonNull
  public final Button agendarBanho;

  @NonNull
  public final TextView bathGrooming;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final AutoCompleteTextView petChoice;

  @NonNull
  public final AutoCompleteTextView serviceType;

  private ActivityBathGroomingBinding(@NonNull FrameLayout rootView,
      @NonNull AutoCompleteTextView agendaBanhoTosa, @NonNull TextView agendamento,
      @NonNull Button agendarBanho, @NonNull TextView bathGrooming, @NonNull ImageView imageView3,
      @NonNull AutoCompleteTextView petChoice, @NonNull AutoCompleteTextView serviceType) {
    this.rootView = rootView;
    this.agendaBanhoTosa = agendaBanhoTosa;
    this.agendamento = agendamento;
    this.agendarBanho = agendarBanho;
    this.bathGrooming = bathGrooming;
    this.imageView3 = imageView3;
    this.petChoice = petChoice;
    this.serviceType = serviceType;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBathGroomingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBathGroomingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_bath_grooming, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBathGroomingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.agendaBanhoTosa;
      AutoCompleteTextView agendaBanhoTosa = ViewBindings.findChildViewById(rootView, id);
      if (agendaBanhoTosa == null) {
        break missingId;
      }

      id = R.id.agendamento;
      TextView agendamento = ViewBindings.findChildViewById(rootView, id);
      if (agendamento == null) {
        break missingId;
      }

      id = R.id.agendarBanho;
      Button agendarBanho = ViewBindings.findChildViewById(rootView, id);
      if (agendarBanho == null) {
        break missingId;
      }

      id = R.id.bathGrooming;
      TextView bathGrooming = ViewBindings.findChildViewById(rootView, id);
      if (bathGrooming == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.petChoice;
      AutoCompleteTextView petChoice = ViewBindings.findChildViewById(rootView, id);
      if (petChoice == null) {
        break missingId;
      }

      id = R.id.serviceType;
      AutoCompleteTextView serviceType = ViewBindings.findChildViewById(rootView, id);
      if (serviceType == null) {
        break missingId;
      }

      return new ActivityBathGroomingBinding((FrameLayout) rootView, agendaBanhoTosa, agendamento,
          agendarBanho, bathGrooming, imageView3, petChoice, serviceType);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
