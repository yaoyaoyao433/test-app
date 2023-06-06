package com.sankuai.xm.imui.common.panel.plugin;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ad;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.imui.IMUIManager;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class SendPlugin extends Plugin {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public int getPluginIcon() {
        return 0;
    }

    public SendPlugin(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d38629ae05066751bb8922bd07fc44d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d38629ae05066751bb8922bd07fc44d9");
        }
    }

    public SendPlugin(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be36f25860544fdf922e85c09a2d0da1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be36f25860544fdf922e85c09a2d0da1");
        }
    }

    public SendPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5252f407adfa9fb782ff17c2483fe12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5252f407adfa9fb782ff17c2483fe12");
        } else {
            setPluginFocusable(false);
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3aa73f621785849b3e482ee7a48f693", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3aa73f621785849b3e482ee7a48f693");
        }
        View inflate = layoutInflater.inflate(R.layout.xm_sdk_send_panel_plugin_send_msg, viewGroup, false);
        Button button = (Button) inflate.findViewById(R.id.send_btn);
        if (getSendBtnBackgroundResource() != 0) {
            button.setBackground(android.support.v7.content.res.b.b(getContext(), getSendBtnBackgroundResource()));
        }
        com.sankuai.xm.imui.theme.b a = com.sankuai.xm.imui.theme.c.a().a(com.sankuai.xm.imui.session.b.b(getContext()).b());
        if (a != null && a.o != null) {
            button.setTextColor(a.o.intValue());
        }
        return inflate;
    }

    public int getSendBtnBackgroundResource() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8759dc5c4869a3b02719c9ca39f079ac", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8759dc5c4869a3b02719c9ca39f079ac")).intValue();
        }
        com.sankuai.xm.imui.theme.b a = com.sankuai.xm.imui.theme.c.a().a(com.sankuai.xm.imui.session.b.b(getContext()).b());
        if (a == null || a.n == null) {
            return 0;
        }
        return a.n.intValue();
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void a() {
        b inputEditorPlugin;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32352883e93eb1ce3d2810b37cf04064", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32352883e93eb1ce3d2810b37cf04064");
            return;
        }
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c2f30934c245f8ef6725bcd19eaa1f5d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c2f30934c245f8ef6725bcd19eaa1f5d");
            return;
        }
        Object[] objArr3 = {this};
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b2b00759196d62ef45ad9ddddf537394", 6917529027641081856L)) {
            inputEditorPlugin = (b) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b2b00759196d62ef45ad9ddddf537394");
        } else {
            inputEditorPlugin = getSendPanel() != null ? getSendPanel().getInputEditorPlugin() : null;
        }
        if (inputEditorPlugin != null) {
            EditText editText = inputEditorPlugin.getEditText();
            TextMessage c = inputEditorPlugin.c();
            String text = c.getText();
            if (TextUtils.isEmpty(text.replaceAll("\\s", ""))) {
                ad.a(getContext(), (int) R.string.xm_sdk_session_msg_tips_empty_message, 0);
                editText.setText((CharSequence) null);
                return;
            }
            c.setText(text);
            int a = IMUIManager.a().a((IMMessage) c, false);
            if (a == 0) {
                editText.setText((CharSequence) null);
            } else if (a == 10002) {
                ad.a(getContext(), (int) R.string.xm_sdk_session_msg_error_text_too_long, 0);
            }
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public String getPluginName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "892831bb16f01bcea5b409b67365b9eb", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "892831bb16f01bcea5b409b67365b9eb") : getResources().getString(R.string.xm_sdk_btn_send);
    }
}
