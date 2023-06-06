package com.meituan.android.ptcommonim.pageadapter.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonHelper;
import com.sankuai.xm.imui.common.util.l;
import com.sankuai.xm.imui.common.view.message.AbstractMsgSideView;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTCommonTopSideView extends AbstractMsgSideView {
    public static ChangeQuickRedirect a;
    private TextView b;

    public PTCommonTopSideView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec43af2dd5bb56fb7cacc02127902fe7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec43af2dd5bb56fb7cacc02127902fe7");
        }
    }

    public PTCommonTopSideView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b14d111aba990108f6bda4cebabb1b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b14d111aba990108f6bda4cebabb1b8");
        }
    }

    public PTCommonTopSideView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17b513d5b7b2e8407710878240d571f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17b513d5b7b2e8407710878240d571f3");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64e541cbf5a1a440610cddee967cd86f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64e541cbf5a1a440610cddee967cd86f");
            return;
        }
        super.onFinishInflate();
        this.b = (TextView) findViewById(R.id.ptim_nick_name);
    }

    @Override // com.sankuai.xm.imui.common.view.message.AbstractMsgSideView
    public final void c(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28c269ac79dfb49ffc2b4481bdd32116", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28c269ac79dfb49ffc2b4481bdd32116");
        } else {
            f(bVar);
        }
    }

    @Override // com.sankuai.xm.imui.common.view.message.AbstractMsgSideView, com.sankuai.xm.imui.common.view.message.a
    public final void a(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89f2e03b978233a94561545685d79345", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89f2e03b978233a94561545685d79345");
            return;
        }
        super.a(bVar);
        f(bVar);
    }

    private void f(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7b626e0de4c42f6d6ff3fbcc26a131d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7b626e0de4c42f6d6ff3fbcc26a131d");
        } else if (bVar == null || bVar.a() == null) {
        } else {
            ICommonAdapter b = com.sankuai.xm.imui.session.b.b(this);
            int nickNameVisibility = b == null ? 8 : b.getNickNameVisibility(bVar);
            l.a(nickNameVisibility, this.b);
            if (nickNameVisibility != 0) {
                return;
            }
            String string = bVar.f() == 1 ? JsonHelper.getString(JsonHelper.toJsonObject(bVar.a().getExtension()), "platformExtension/nickName") : null;
            if (TextUtils.isEmpty(string)) {
                string = bVar.d();
            }
            if (!TextUtils.isEmpty(string)) {
                this.b.setText(string);
            } else {
                this.b.setText("");
            }
        }
    }
}
