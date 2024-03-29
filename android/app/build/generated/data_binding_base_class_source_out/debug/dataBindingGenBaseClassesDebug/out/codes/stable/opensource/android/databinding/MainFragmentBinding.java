// Generated by data binding compiler. Do not edit!
package codes.stable.opensource.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import codes.stable.opensource.android.MainViewModel;
import codes.stable.opensource.android.R;
import com.google.android.material.button.MaterialButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class MainFragmentBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton btnOne;

  @NonNull
  public final MaterialButton btnThree;

  @NonNull
  public final MaterialButton btnTwo;

  @Bindable
  protected MainViewModel mViewModel;

  @Bindable
  protected View.OnClickListener mOnClickListener;

  protected MainFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton btnOne, MaterialButton btnThree, MaterialButton btnTwo) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnOne = btnOne;
    this.btnThree = btnThree;
    this.btnTwo = btnTwo;
  }

  public abstract void setViewModel(@Nullable MainViewModel viewModel);

  @Nullable
  public MainViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setOnClickListener(@Nullable View.OnClickListener onClickListener);

  @Nullable
  public View.OnClickListener getOnClickListener() {
    return mOnClickListener;
  }

  @NonNull
  public static MainFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.main_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MainFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MainFragmentBinding>inflateInternal(inflater, R.layout.main_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static MainFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.main_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MainFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<MainFragmentBinding>inflateInternal(inflater, R.layout.main_fragment, null, false, component);
  }

  public static MainFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static MainFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (MainFragmentBinding)bind(component, view, R.layout.main_fragment);
  }
}
