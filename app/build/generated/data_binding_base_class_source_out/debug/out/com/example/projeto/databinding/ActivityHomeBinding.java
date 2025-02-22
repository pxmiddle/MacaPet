// Generated by view binder compiler. Do not edit!
package com.example.projeto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.projeto.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHomeBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button buttonAbout;

  @NonNull
  public final Button buttonBath;

  @NonNull
  public final Button buttonProducts;

  @NonNull
  public final Button buttonProfile;

  @NonNull
  public final Button buttonVacines;

  @NonNull
  public final FrameLayout homePage;

  private ActivityHomeBinding(@NonNull FrameLayout rootView, @NonNull Button buttonAbout,
      @NonNull Button buttonBath, @NonNull Button buttonProducts, @NonNull Button buttonProfile,
      @NonNull Button buttonVacines, @NonNull FrameLayout homePage) {
    this.rootView = rootView;
    this.buttonAbout = buttonAbout;
    this.buttonBath = buttonBath;
    this.buttonProducts = buttonProducts;
    this.buttonProfile = buttonProfile;
    this.buttonVacines = buttonVacines;
    this.homePage = homePage;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonAbout;
      Button buttonAbout = ViewBindings.findChildViewById(rootView, id);
      if (buttonAbout == null) {
        break missingId;
      }

      id = R.id.buttonBath;
      Button buttonBath = ViewBindings.findChildViewById(rootView, id);
      if (buttonBath == null) {
        break missingId;
      }

      id = R.id.buttonProducts;
      Button buttonProducts = ViewBindings.findChildViewById(rootView, id);
      if (buttonProducts == null) {
        break missingId;
      }

      id = R.id.buttonProfile;
      Button buttonProfile = ViewBindings.findChildViewById(rootView, id);
      if (buttonProfile == null) {
        break missingId;
      }

      id = R.id.buttonVacines;
      Button buttonVacines = ViewBindings.findChildViewById(rootView, id);
      if (buttonVacines == null) {
        break missingId;
      }

      FrameLayout homePage = (FrameLayout) rootView;

      return new ActivityHomeBinding((FrameLayout) rootView, buttonAbout, buttonBath,
          buttonProducts, buttonProfile, buttonVacines, homePage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
