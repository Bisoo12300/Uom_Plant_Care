// Generated by view binder compiler. Do not edit!
package com.grzeluu.plantcareapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.grzeluu.plantcareapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemMyPlantBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView btConfirm;

  @NonNull
  public final ImageView btDelete;

  @NonNull
  public final ImageView btExpand;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final CheckBox cbFertilizing;

  @NonNull
  public final CheckBox cbSpraying;

  @NonNull
  public final CheckBox cbWatering;

  @NonNull
  public final View dividerHorizontal;

  @NonNull
  public final View dividerVertical;

  @NonNull
  public final ConstraintLayout expandable;

  @NonNull
  public final ImageView ivFertilization;

  @NonNull
  public final ImageView ivPhoto;

  @NonNull
  public final ImageView ivRotate;

  @NonNull
  public final ImageView ivWater;

  @NonNull
  public final LinearLayout llTracks;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final ProgressBar pbFertilizer;

  @NonNull
  public final ProgressBar pbSpraying;

  @NonNull
  public final ProgressBar pbWater;

  @NonNull
  public final RelativeLayout rlFertilization;

  @NonNull
  public final RelativeLayout rlSpraying;

  @NonNull
  public final RelativeLayout rlWater;

  @NonNull
  public final TextView tvFertilization;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvSpraying;

  @NonNull
  public final TextView tvWater;

  @NonNull
  public final ImageView warning;

  private ItemMyPlantBinding(@NonNull LinearLayout rootView, @NonNull ImageView btConfirm,
      @NonNull ImageView btDelete, @NonNull ImageView btExpand, @NonNull CardView cardView,
      @NonNull CheckBox cbFertilizing, @NonNull CheckBox cbSpraying, @NonNull CheckBox cbWatering,
      @NonNull View dividerHorizontal, @NonNull View dividerVertical,
      @NonNull ConstraintLayout expandable, @NonNull ImageView ivFertilization,
      @NonNull ImageView ivPhoto, @NonNull ImageView ivRotate, @NonNull ImageView ivWater,
      @NonNull LinearLayout llTracks, @NonNull ConstraintLayout main,
      @NonNull ProgressBar pbFertilizer, @NonNull ProgressBar pbSpraying,
      @NonNull ProgressBar pbWater, @NonNull RelativeLayout rlFertilization,
      @NonNull RelativeLayout rlSpraying, @NonNull RelativeLayout rlWater,
      @NonNull TextView tvFertilization, @NonNull TextView tvName, @NonNull TextView tvSpraying,
      @NonNull TextView tvWater, @NonNull ImageView warning) {
    this.rootView = rootView;
    this.btConfirm = btConfirm;
    this.btDelete = btDelete;
    this.btExpand = btExpand;
    this.cardView = cardView;
    this.cbFertilizing = cbFertilizing;
    this.cbSpraying = cbSpraying;
    this.cbWatering = cbWatering;
    this.dividerHorizontal = dividerHorizontal;
    this.dividerVertical = dividerVertical;
    this.expandable = expandable;
    this.ivFertilization = ivFertilization;
    this.ivPhoto = ivPhoto;
    this.ivRotate = ivRotate;
    this.ivWater = ivWater;
    this.llTracks = llTracks;
    this.main = main;
    this.pbFertilizer = pbFertilizer;
    this.pbSpraying = pbSpraying;
    this.pbWater = pbWater;
    this.rlFertilization = rlFertilization;
    this.rlSpraying = rlSpraying;
    this.rlWater = rlWater;
    this.tvFertilization = tvFertilization;
    this.tvName = tvName;
    this.tvSpraying = tvSpraying;
    this.tvWater = tvWater;
    this.warning = warning;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemMyPlantBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemMyPlantBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_my_plant, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemMyPlantBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bt_confirm;
      ImageView btConfirm = ViewBindings.findChildViewById(rootView, id);
      if (btConfirm == null) {
        break missingId;
      }

      id = R.id.bt_delete;
      ImageView btDelete = ViewBindings.findChildViewById(rootView, id);
      if (btDelete == null) {
        break missingId;
      }

      id = R.id.bt_expand;
      ImageView btExpand = ViewBindings.findChildViewById(rootView, id);
      if (btExpand == null) {
        break missingId;
      }

      id = R.id.cardView;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.cb_fertilizing;
      CheckBox cbFertilizing = ViewBindings.findChildViewById(rootView, id);
      if (cbFertilizing == null) {
        break missingId;
      }

      id = R.id.cb_spraying;
      CheckBox cbSpraying = ViewBindings.findChildViewById(rootView, id);
      if (cbSpraying == null) {
        break missingId;
      }

      id = R.id.cb_watering;
      CheckBox cbWatering = ViewBindings.findChildViewById(rootView, id);
      if (cbWatering == null) {
        break missingId;
      }

      id = R.id.divider_horizontal;
      View dividerHorizontal = ViewBindings.findChildViewById(rootView, id);
      if (dividerHorizontal == null) {
        break missingId;
      }

      id = R.id.divider_vertical;
      View dividerVertical = ViewBindings.findChildViewById(rootView, id);
      if (dividerVertical == null) {
        break missingId;
      }

      id = R.id.expandable;
      ConstraintLayout expandable = ViewBindings.findChildViewById(rootView, id);
      if (expandable == null) {
        break missingId;
      }

      id = R.id.iv_fertilization;
      ImageView ivFertilization = ViewBindings.findChildViewById(rootView, id);
      if (ivFertilization == null) {
        break missingId;
      }

      id = R.id.iv_photo;
      ImageView ivPhoto = ViewBindings.findChildViewById(rootView, id);
      if (ivPhoto == null) {
        break missingId;
      }

      id = R.id.iv_rotate;
      ImageView ivRotate = ViewBindings.findChildViewById(rootView, id);
      if (ivRotate == null) {
        break missingId;
      }

      id = R.id.iv_water;
      ImageView ivWater = ViewBindings.findChildViewById(rootView, id);
      if (ivWater == null) {
        break missingId;
      }

      id = R.id.ll_tracks;
      LinearLayout llTracks = ViewBindings.findChildViewById(rootView, id);
      if (llTracks == null) {
        break missingId;
      }

      id = R.id.main;
      ConstraintLayout main = ViewBindings.findChildViewById(rootView, id);
      if (main == null) {
        break missingId;
      }

      id = R.id.pb_fertilizer;
      ProgressBar pbFertilizer = ViewBindings.findChildViewById(rootView, id);
      if (pbFertilizer == null) {
        break missingId;
      }

      id = R.id.pb_spraying;
      ProgressBar pbSpraying = ViewBindings.findChildViewById(rootView, id);
      if (pbSpraying == null) {
        break missingId;
      }

      id = R.id.pb_water;
      ProgressBar pbWater = ViewBindings.findChildViewById(rootView, id);
      if (pbWater == null) {
        break missingId;
      }

      id = R.id.rl_fertilization;
      RelativeLayout rlFertilization = ViewBindings.findChildViewById(rootView, id);
      if (rlFertilization == null) {
        break missingId;
      }

      id = R.id.rl_spraying;
      RelativeLayout rlSpraying = ViewBindings.findChildViewById(rootView, id);
      if (rlSpraying == null) {
        break missingId;
      }

      id = R.id.rl_water;
      RelativeLayout rlWater = ViewBindings.findChildViewById(rootView, id);
      if (rlWater == null) {
        break missingId;
      }

      id = R.id.tv_fertilization;
      TextView tvFertilization = ViewBindings.findChildViewById(rootView, id);
      if (tvFertilization == null) {
        break missingId;
      }

      id = R.id.tv_name;
      TextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      id = R.id.tv_spraying;
      TextView tvSpraying = ViewBindings.findChildViewById(rootView, id);
      if (tvSpraying == null) {
        break missingId;
      }

      id = R.id.tv_water;
      TextView tvWater = ViewBindings.findChildViewById(rootView, id);
      if (tvWater == null) {
        break missingId;
      }

      id = R.id.warning;
      ImageView warning = ViewBindings.findChildViewById(rootView, id);
      if (warning == null) {
        break missingId;
      }

      return new ItemMyPlantBinding((LinearLayout) rootView, btConfirm, btDelete, btExpand,
          cardView, cbFertilizing, cbSpraying, cbWatering, dividerHorizontal, dividerVertical,
          expandable, ivFertilization, ivPhoto, ivRotate, ivWater, llTracks, main, pbFertilizer,
          pbSpraying, pbWater, rlFertilization, rlSpraying, rlWater, tvFertilization, tvName,
          tvSpraying, tvWater, warning);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}