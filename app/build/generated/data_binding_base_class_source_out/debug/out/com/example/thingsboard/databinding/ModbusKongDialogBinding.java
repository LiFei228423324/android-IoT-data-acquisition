// Generated by view binder compiler. Do not edit!
package com.example.thingsboard.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.thingsboard.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ModbusKongDialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button devicecancel;

  @NonNull
  public final Button deviceok;

  @NonNull
  public final EditText edKongApitag;

  @NonNull
  public final EditText edKongName;

  @NonNull
  public final LinearLayout other;

  @NonNull
  public final LinearLayout pushrod;

  @NonNull
  public final Spinner pushrodChu;

  @NonNull
  public final Spinner pushrodHui;

  @NonNull
  public final Spinner spDeviceKong;

  @NonNull
  public final Spinner spDeviceKongDo;

  private ModbusKongDialogBinding(@NonNull LinearLayout rootView, @NonNull Button devicecancel,
      @NonNull Button deviceok, @NonNull EditText edKongApitag, @NonNull EditText edKongName,
      @NonNull LinearLayout other, @NonNull LinearLayout pushrod, @NonNull Spinner pushrodChu,
      @NonNull Spinner pushrodHui, @NonNull Spinner spDeviceKong, @NonNull Spinner spDeviceKongDo) {
    this.rootView = rootView;
    this.devicecancel = devicecancel;
    this.deviceok = deviceok;
    this.edKongApitag = edKongApitag;
    this.edKongName = edKongName;
    this.other = other;
    this.pushrod = pushrod;
    this.pushrodChu = pushrodChu;
    this.pushrodHui = pushrodHui;
    this.spDeviceKong = spDeviceKong;
    this.spDeviceKongDo = spDeviceKongDo;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ModbusKongDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ModbusKongDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.modbus_kong_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ModbusKongDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.devicecancel;
      Button devicecancel = ViewBindings.findChildViewById(rootView, id);
      if (devicecancel == null) {
        break missingId;
      }

      id = R.id.deviceok;
      Button deviceok = ViewBindings.findChildViewById(rootView, id);
      if (deviceok == null) {
        break missingId;
      }

      id = R.id.ed_kong_apitag;
      EditText edKongApitag = ViewBindings.findChildViewById(rootView, id);
      if (edKongApitag == null) {
        break missingId;
      }

      id = R.id.ed_kong_name;
      EditText edKongName = ViewBindings.findChildViewById(rootView, id);
      if (edKongName == null) {
        break missingId;
      }

      id = R.id.other;
      LinearLayout other = ViewBindings.findChildViewById(rootView, id);
      if (other == null) {
        break missingId;
      }

      id = R.id.pushrod;
      LinearLayout pushrod = ViewBindings.findChildViewById(rootView, id);
      if (pushrod == null) {
        break missingId;
      }

      id = R.id.pushrod_chu;
      Spinner pushrodChu = ViewBindings.findChildViewById(rootView, id);
      if (pushrodChu == null) {
        break missingId;
      }

      id = R.id.pushrod_hui;
      Spinner pushrodHui = ViewBindings.findChildViewById(rootView, id);
      if (pushrodHui == null) {
        break missingId;
      }

      id = R.id.sp_device_kong;
      Spinner spDeviceKong = ViewBindings.findChildViewById(rootView, id);
      if (spDeviceKong == null) {
        break missingId;
      }

      id = R.id.sp_device_kong_do;
      Spinner spDeviceKongDo = ViewBindings.findChildViewById(rootView, id);
      if (spDeviceKongDo == null) {
        break missingId;
      }

      return new ModbusKongDialogBinding((LinearLayout) rootView, devicecancel, deviceok,
          edKongApitag, edKongName, other, pushrod, pushrodChu, pushrodHui, spDeviceKong,
          spDeviceKongDo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
