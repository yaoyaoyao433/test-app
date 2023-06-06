package com.sankuai.waimai.store.base;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NonNull
    public final Context mContext;
    @NonNull
    protected final LayoutInflater mInflater;
    public View mView;

    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf7f583a327879cb6a746d983b0b0280", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf7f583a327879cb6a746d983b0b0280");
        }
    }

    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "917645025e6ce0d28c0ec7291aa9e153", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "917645025e6ce0d28c0ec7291aa9e153");
        }
    }

    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b83770a7056078ec8a6d67027f8f0bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b83770a7056078ec8a6d67027f8f0bb");
        }
    }

    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cd555c46d9ec406ed9e4a9cfeda5e19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cd555c46d9ec406ed9e4a9cfeda5e19");
        }
    }

    public b(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5a5b4aa7c6fe4ac0f76983d1ea2a271", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5a5b4aa7c6fe4ac0f76983d1ea2a271");
            return;
        }
        this.mContext = context;
        this.mInflater = LayoutInflater.from(context);
    }

    public void bindView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6c6a88c621b265988abf607add703b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6c6a88c621b265988abf607add703b9");
            return;
        }
        this.mView = view;
        onViewCreated();
    }

    public final View createView(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21d0adeef38a41b8ca0177eaf6970a62", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21d0adeef38a41b8ca0177eaf6970a62");
        }
        if (this.mView == null) {
            this.mView = onCreateView(this.mInflater, viewGroup);
            onViewCreated();
        }
        return this.mView;
    }

    public final View createAndReplaceView(View view, @IdRes int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98110b830c6e86b1771e8d730c2c022c", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98110b830c6e86b1771e8d730c2c022c") : createAndReplaceView((ViewGroup) view.findViewById(i));
    }

    public final View createAndReplaceView(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de97752aac0b178a52837146dcf1a8c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de97752aac0b178a52837146dcf1a8c6");
        }
        View createView = createView(viewGroup);
        viewGroup.removeAllViews();
        viewGroup.addView(createView);
        return createView;
    }

    @NonNull
    public Context getContext() {
        return this.mContext;
    }

    @NonNull
    public LayoutInflater getLayoutInflater() {
        return this.mInflater;
    }

    public View getView() {
        return this.mView;
    }

    public void setViewAlpha(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb4268c7d0f5512ffb299a86f8bc2b1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb4268c7d0f5512ffb299a86f8bc2b1d");
        } else if (this.mView != null) {
            this.mView.setAlpha(f);
        }
    }

    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95b0a5a796efba4493de99174ab75bcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95b0a5a796efba4493de99174ab75bcc");
        } else if (this.mView != null) {
            this.mView.setVisibility(0);
        }
    }

    public void hide() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1770880604803492be395473bccc1ce8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1770880604803492be395473bccc1ce8");
        } else if (this.mView != null) {
            this.mView.setVisibility(8);
        }
    }

    public void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9854b40eefe51afdc758619ac1af5cd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9854b40eefe51afdc758619ac1af5cd7");
        } else if (this.mView != null) {
            this.mView.setVisibility(z ? 0 : 8);
        }
    }

    public boolean isVisible() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc02b8e4692c098a33ea7a8b00c71bbb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc02b8e4692c098a33ea7a8b00c71bbb")).booleanValue() : this.mView != null && this.mView.getVisibility() == 0;
    }

    public <T extends View> T findView(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47236b21d78492d31a99879352d0b74a", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47236b21d78492d31a99879352d0b74a");
        }
        if (this.mView != null) {
            return (T) this.mView.findViewById(i);
        }
        return null;
    }
}
