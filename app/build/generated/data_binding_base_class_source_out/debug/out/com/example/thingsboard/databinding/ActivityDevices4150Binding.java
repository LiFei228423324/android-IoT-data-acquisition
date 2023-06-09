// Generated by view binder compiler. Do not edit!
package com.example.thingsboard.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.thingsboard.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDevices4150Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView addKong;

  @NonNull
  public final TextView addSensor;

  @NonNull
  public final RecyclerView deviceRecycler;

  @NonNull
  public final TextView tvBtn;

  private ActivityDevices4150Binding(@NonNull LinearLayout rootView, @NonNull TextView addKong,
      @NonNull TextView addSensor, @NonNull RecyclerView deviceRecycler, @NonNull TextView tvBtn) {
    this.rootView = rootView;
    this.addKong = addKong;
    this.addSensor = addSensor;
    this.deviceRecycler = deviceRecycler;
    this.tvBtn = tvBtn;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDevices4150Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDevices4150Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_devices4150, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDevices4150Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_kong;
      TextView addKong = ViewBindings.findChildViewById(rootView, id);
      if (addKong == null) {
        break missingId;
      }

      id = R.id.add_sensor;
      TextView addSensor = ViewBindings.findChildViewById(rootView, id);
      if (addSensor == null) {
        break missingId;
      }

      id = R.id.device_recycler;
      RecyclerView deviceRecycler = ViewBindings.findChildViewById(rootView, id);
      if (deviceRecycler == null) {
        break missingId;
      }

      id = R.id.tv_btn;
      TextView tvBtn = ViewBindings.findChildViewById(rootView, id);
      if (tvBtn == null) {
        break missingId;
      }

      return new ActivityDevices4150Binding((LinearLayout) rootView, addKong, addSensor,
          deviceRecycler, tvBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
