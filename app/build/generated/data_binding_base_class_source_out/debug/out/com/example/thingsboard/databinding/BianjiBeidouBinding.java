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

public final class BianjiBeidouBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView addBeidouDevices;

  @NonNull
  public final TextView bianjiBeidouConnect;

  @NonNull
  public final RecyclerView bianjiBeidouRecycler;

  private BianjiBeidouBinding(@NonNull LinearLayout rootView, @NonNull TextView addBeidouDevices,
      @NonNull TextView bianjiBeidouConnect, @NonNull RecyclerView bianjiBeidouRecycler) {
    this.rootView = rootView;
    this.addBeidouDevices = addBeidouDevices;
    this.bianjiBeidouConnect = bianjiBeidouConnect;
    this.bianjiBeidouRecycler = bianjiBeidouRecycler;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BianjiBeidouBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BianjiBeidouBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.bianji_beidou, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BianjiBeidouBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_beidou_devices;
      TextView addBeidouDevices = ViewBindings.findChildViewById(rootView, id);
      if (addBeidouDevices == null) {
        break missingId;
      }

      id = R.id.bianji_beidou_connect;
      TextView bianjiBeidouConnect = ViewBindings.findChildViewById(rootView, id);
      if (bianjiBeidouConnect == null) {
        break missingId;
      }

      id = R.id.bianji_beidou_recycler;
      RecyclerView bianjiBeidouRecycler = ViewBindings.findChildViewById(rootView, id);
      if (bianjiBeidouRecycler == null) {
        break missingId;
      }

      return new BianjiBeidouBinding((LinearLayout) rootView, addBeidouDevices, bianjiBeidouConnect,
          bianjiBeidouRecycler);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
