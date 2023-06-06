package com.meituan.android.legwork.ui.view;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CustomTitleBarAdapt implements TitleBarAdapter {
    public static ChangeQuickRedirect a;
    protected Activity b;
    protected View c;
    protected ImageView d;
    protected TextView e;
    protected View f;
    private View.OnClickListener g;
    private String h;

    @Override // com.sankuai.xm.imui.common.view.titlebar.BaseTitleBarAdapter
    public void onThemeChanged(com.sankuai.xm.imui.theme.b bVar) {
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter
    public void onUnreadCountChanged(int i) {
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.BaseTitleBarAdapter
    public View createView(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bbc1ddf7c3082af62b666736752a92b", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bbc1ddf7c3082af62b666736752a92b");
        }
        if (context == null || viewGroup == null) {
            return null;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.legwork_xm_sdk_titlebar, viewGroup, true);
        Object[] objArr2 = {inflate};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "700f8491dcef661df848f0c95a865633", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "700f8491dcef661df848f0c95a865633");
        } else {
            this.c = inflate.findViewById(R.id.root_view);
            this.d = (ImageView) this.c.findViewById(R.id.img_back);
            this.e = (TextView) this.c.findViewById(R.id.tv_title);
            this.f = this.c.findViewById(R.id.v_im_right_button);
            this.d.setOnClickListener(a.a(this));
            if (this.g != null) {
                this.f.setOnClickListener(this.g);
            }
            if (!TextUtils.isEmpty(this.h)) {
                this.e.setText(this.h);
            }
        }
        return inflate;
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.BaseTitleBarAdapter
    public void onAttach(Activity activity) {
        this.b = activity;
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.BaseTitleBarAdapter
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5adc82db9618007a0e3fdd97a5f93ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5adc82db9618007a0e3fdd97a5f93ec");
        } else {
            this.b = null;
        }
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter
    public void onTitleTextChanged(String str) {
        String charSequence;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e82e7bb8a7457291d7c045c2c3572017", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e82e7bb8a7457291d7c045c2c3572017");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b493e2de7a37b94e3a2157b1fd952d2f", RobustBitConfig.DEFAULT_VALUE)) {
            charSequence = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b493e2de7a37b94e3a2157b1fd952d2f");
        } else {
            charSequence = this.e == null ? "" : this.e.getText().toString();
        }
        if (TextUtils.isEmpty(charSequence)) {
            a(str);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d06818d3fc18c336421011dfe4d1fa0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d06818d3fc18c336421011dfe4d1fa0");
        } else if (str == null) {
        } else {
            if (this.e != null) {
                this.e.setText(str);
            } else {
                this.h = str;
            }
        }
    }

    public final void a(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1cf364441457cf392224fddc8eb9edd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1cf364441457cf392224fddc8eb9edd");
        } else if (onClickListener == null) {
        } else {
            if (this.f != null) {
                this.f.setOnClickListener(onClickListener);
            } else {
                this.g = onClickListener;
            }
        }
    }

    public static /* synthetic */ void a(CustomTitleBarAdapt customTitleBarAdapt, View view) {
        Object[] objArr = {customTitleBarAdapt, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a48745b14a374b741762e83042891bd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a48745b14a374b741762e83042891bd6");
        } else if (customTitleBarAdapt.b != null) {
            customTitleBarAdapt.b.finish();
        }
    }
}
