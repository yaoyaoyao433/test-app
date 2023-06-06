package com.meituan.android.ptcommonim.pageadapter.widget;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonHelper;
import com.sankuai.xm.im.message.bean.MsgAddition;
import com.sankuai.xm.imui.common.view.message.AbstractMsgSideView;
import com.sankuai.xm.imui.session.SessionFragment;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTCommonBottomSideView extends AbstractMsgSideView {
    public static ChangeQuickRedirect a;
    private TextView b;

    public PTCommonBottomSideView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f757e33b17386555dbf5bd5fa5abd574", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f757e33b17386555dbf5bd5fa5abd574");
        }
    }

    public PTCommonBottomSideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bba4193dfae7ccc8b9f9a75e45f9bcc5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bba4193dfae7ccc8b9f9a75e45f9bcc5");
        }
    }

    public PTCommonBottomSideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc8f1a5097edeb3bfc840f0e1e46b95d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc8f1a5097edeb3bfc840f0e1e46b95d");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e5efe90292d43fb2253640f9f543549", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e5efe90292d43fb2253640f9f543549");
            return;
        }
        super.onFinishInflate();
        this.b = (TextView) findViewById(R.id.ptim_message_bottom_side_text);
    }

    @Override // com.sankuai.xm.imui.common.view.message.AbstractMsgSideView, com.sankuai.xm.imui.common.view.message.a
    public final void a(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b45db402a4d246380a63dc2c115938f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b45db402a4d246380a63dc2c115938f");
            return;
        }
        super.a(bVar);
        f(bVar);
    }

    @Override // com.sankuai.xm.imui.common.view.message.AbstractMsgSideView
    public final void b(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86b9bd26e6616c60e1b2b1360dc4de27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86b9bd26e6616c60e1b2b1360dc4de27");
            return;
        }
        super.b(bVar);
        f(bVar);
    }

    private void f(com.sankuai.xm.imui.session.entity.b bVar) {
        MsgAddition j;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fbf245bc4e8d299f777609415de100c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fbf245bc4e8d299f777609415de100c");
        } else if (bVar != null && (j = bVar.j()) != null) {
            try {
                JsonObject jsonObject = (JsonObject) JsonHelper.fromJson(j.getAdditionData(), JsonObject.class);
                boolean z = JsonHelper.getBoolean(jsonObject, "platformAddition/sendSuccess", true);
                a(JsonHelper.getString(jsonObject, "platformAddition/userTips"), 0);
                a(bVar, z);
            } catch (Throwable unused) {
            }
        } else if (this.b != null) {
            this.b.setVisibility(8);
        }
    }

    private void a(String str, int i) {
        Object[] objArr = {str, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee30fc722c67a2064877c3ce500a2eaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee30fc722c67a2064877c3ce500a2eaf");
        } else if (this.b == null) {
        } else {
            if (!TextUtils.isEmpty(str)) {
                this.b.setVisibility(0);
                this.b.setText(str);
                return;
            }
            this.b.setVisibility(8);
        }
    }

    private void a(com.sankuai.xm.imui.session.entity.b bVar, boolean z) {
        SessionFragment a2;
        Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4245c8e4d7d6755acbbcbb5a175a9f09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4245c8e4d7d6755acbbcbb5a175a9f09");
        } else if (bVar == null || z || (a2 = com.sankuai.xm.imui.session.b.a((View) this)) == null || !a2.isAdded() || bVar.a().getMsgStatus() == 4) {
        } else {
            bVar.a().setMsgStatus(4);
            a2.a(bVar, 78000);
        }
    }
}
