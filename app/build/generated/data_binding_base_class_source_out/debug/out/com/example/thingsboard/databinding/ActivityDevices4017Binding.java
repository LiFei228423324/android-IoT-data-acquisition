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

public final class ActivityDevices4017Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView addSensor4017;

  @NonNull
  public final TextView back4017;

  @NonNull
  public final RecyclerView deviceRecycler4017;

  private ActivityDevices4017Binding(@NonNull LinearLayout rootView,
      @NonNull TextView addSensor4017, @NonNull TextView back4017,
      @NonNull RecyclerView deviceRecycler4017) {
    this.rootView = rootView;
    this.addSensor4017 = addSensor4017;
    this.back4017 = back4017;
    this.deviceRecycler4017 = deviceRecycler4017;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDevices4017Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDevices4017Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_devices4017, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDevices4017Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_sensor_4017;
      TextView addSensor4017 = ViewBindings.findChildViewById(rootView, id);
      if (addSensor4017 == null) {
        break missingId;
      }

      id = R.id.back_4017;
      TextView back4017 = ViewBindings.findChildViewById(rootView, id);
      if (back4017 == null) {
        break missingId;
      }

      id = R.id.device_recycler_4017;
      RecyclerView deviceRecycler4017 = ViewBindings.findChildViewById(rootView, id);
      if (deviceRecycler4017 == null) {
        break missingId;
      }

      return new ActivityDevices4017Binding((LinearLayout) rootView, addSensor4017, back4017,
          deviceRecycler4017);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}