package com.sankuai.waimai.store.search.common.view;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.newwidgets.AnimatableImageView;
import com.sankuai.waimai.store.search.model.PrescriptionRemindInfo;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    public PrescriptionRemindInfo b;
    public long c;
    public long d;
    private AnimatableImageView e;
    private TextView f;

    public c(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85ac9aa2cb77185a468b30c2c8ace5d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85ac9aa2cb77185a468b30c2c8ace5d9");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3506236c4e15deb4a53935258c829636", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3506236c4e15deb4a53935258c829636") : layoutInflater.inflate(R.layout.wm_sc_serach_prescription_progress_info, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d755255e7ada58360d1aa7a803a8a604", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d755255e7ada58360d1aa7a803a8a604");
            return;
        }
        this.e = (AnimatableImageView) this.mView.findViewById(R.id.prescription_progress_info);
        this.f = (TextView) this.mView.findViewById(R.id.prescription_tips_info);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16ba306434f9e12717e71e95930a54ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16ba306434f9e12717e71e95930a54ab");
            return;
        }
        if (this.mView.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.mView.getParent()).setVisibility(8);
        }
        this.e.setVisibility(8);
        Drawable drawable = this.e.getDrawable();
        Object[] objArr2 = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7347bf4e01c656a2e6341b70b6de8948", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7347bf4e01c656a2e6341b70b6de8948");
        } else if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        a((String) null);
        this.mView.setOnClickListener(null);
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f42f688ab8f4fa98d48a17128258dfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f42f688ab8f4fa98d48a17128258dfb");
            return;
        }
        if (this.mView.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.mView.getParent()).setVisibility(0);
        }
        this.e.setVisibility(0);
        Drawable drawable = this.e.getDrawable();
        Object[] objArr2 = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38844e5084823798f7fc499a220f98f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38844e5084823798f7fc499a220f98f4");
        } else if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).start();
        }
        this.c = System.currentTimeMillis();
        if (z) {
            a(com.sankuai.waimai.store.config.d.h().a(SCConfigPath.DRUG_SEARCH_PRESCRIPTION_LOADING_TEXT, ""));
        } else {
            a((String) null);
        }
    }

    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f4a6461e1d9a673fed6063d25035ee2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f4a6461e1d9a673fed6063d25035ee2");
        } else {
            ah.a(this.f, str);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect a;

        public a() {
            Object[] objArr = {c.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2588507635c9cf637b9593670665d9d5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2588507635c9cf637b9593670665d9d5");
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da777b65d5552eebbd963c8b2a5d315f", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da777b65d5552eebbd963c8b2a5d315f");
            } else {
                c.this.a();
            }
        }
    }
}
