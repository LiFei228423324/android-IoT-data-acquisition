// Generated by view binder compiler. Do not edit!
package com.example.thingsboard.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.thingsboard.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RecyclerItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton bianjiDevice;

  @NonNull
  public final LinearLayout btnBianji;

  @NonNull
  public final TextView devicesAddress;

  @NonNull
  public final TextView devicesName;

  @NonNull
  public final TextView devicesType;

  @NonNull
  public final ImageButton shanchuDevice;

  private RecyclerItemBinding(@NonNull LinearLayout rootView, @NonNull ImageButton bianjiDevice,
      @NonNull LinearLayout btnBianji, @NonNull TextView devicesAddress,
      @NonNull TextView devicesName, @NonNull TextView devicesType,
      @NonNull ImageButton shanchuDevice) {
    this.rootView = rootView;
    this.bianjiDevice = bianjiDevice;
    this.btnBianji = btnBianji;
    this.devicesAddress = devicesAddress;
    this.devicesName = devicesName;
    this.devicesType = devicesType;
    this.shanchuDevice = shanchuDevice;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
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
      id = R.id.bianji_device;
      ImageButton bianjiDevice = ViewBindings.findChildViewById(rootView, id);
      if (bianjiDevice == null) {
        break missingId;
      }

      id = R.id.btn_bianji;
      LinearLayout btnBianji = ViewBindings.findChildViewById(rootView, id);
      if (btnBianji == null) {
        break missingId;
      }

      id = R.id.devices_address;
      TextView devicesAddress = ViewBindings.findChildViewById(rootView, id);
      if (devicesAddress == null) {
        break missingId;
      }

      id = R.id.devices_name;
      TextView devicesName = ViewBindings.findChildViewById(rootView, id);
      if (devicesName == null) {
        break missingId;
      }

      id = R.id.devices_type;
      TextView devicesType = ViewBindings.findChildViewById(rootView, id);
      if (devicesType == null) {
        break missingId;
      }

      id = R.id.shanchu_device;
      ImageButton shanchuDevice = ViewBindings.findChildViewById(rootView, id);
      if (shanchuDevice == null) {
        break missingId;
      }

      return new RecyclerItemBinding((LinearLayout) rootView, bianjiDevice, btnBianji,
          devicesAddress, devicesName, devicesType, shanchuDevice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
