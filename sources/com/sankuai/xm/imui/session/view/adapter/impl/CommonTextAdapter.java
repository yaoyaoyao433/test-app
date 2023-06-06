package com.sankuai.xm.imui.session.view.adapter.impl;

import android.content.Context;
import android.content.DialogInterface;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.g;
import com.sankuai.xm.imui.common.processors.LinkProcessor;
import com.sankuai.xm.imui.common.util.k;
import com.sankuai.xm.imui.common.util.l;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.MsgViewType;
import com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter;
import com.sankuai.xm.imui.session.view.menu.a;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class CommonTextAdapter extends BaseMsgAdapter implements ICommonTextAdapter {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public int getLineSpacingExtra(b bVar) {
        return 10;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public Set<String> getTextLinkSchema() {
        return null;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public boolean hasLinkTextUnderLine(b bVar) {
        return false;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public boolean onTextLinkClick(View view, final String str) {
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbdb4c1697ce2e5b01ee798a2fb17170", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbdb4c1697ce2e5b01ee798a2fb17170")).booleanValue();
        }
        if (LinkProcessor.a(str)) {
            l.a(view.getContext(), str);
        } else if (LinkProcessor.b(str)) {
            Object[] objArr2 = {view, str};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cc65d86081130d3cd74f2408cc2788de", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cc65d86081130d3cd74f2408cc2788de");
            } else if (view != null && !ac.a(str)) {
                final String substring = str.substring(str.indexOf(CommonConstant.Symbol.COLON) + 1);
                final Context context = view.getContext();
                final String[] strArr = {context.getString(R.string.xm_sdk_tel_menu_call, substring), context.getString(R.string.xm_sdk_msg_menu_copy)};
                g.a(strArr, context.getString(R.string.xm_sdk_tel_menu_title, substring), new DialogInterface.OnClickListener() { // from class: com.sankuai.xm.imui.session.view.menu.a.2
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b73adc18d9627a8659443cfa66333bd8", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b73adc18d9627a8659443cfa66333bd8");
                        } else if (i >= strArr.length) {
                        } else {
                            switch (i) {
                                case 0:
                                    l.b(context, str);
                                    return;
                                case 1:
                                    k.a(context, substring);
                                    return;
                                default:
                                    return;
                            }
                        }
                    }
                });
            }
        }
        return true;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public int getTextColor(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3e0324b3503910405b2eda0b864a6ca", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3e0324b3503910405b2eda0b864a6ca")).intValue();
        }
        int a2 = MsgViewType.a(bVar.b);
        if (a2 != 1) {
            if (a2 == 11) {
                return this.e.getResources().getColor(R.color.xm_sdk_chat_msg_event_text);
            }
            if (bVar.g == 1) {
                return this.e.getResources().getColor(R.color.xm_sdk_chat_msg_text_color_left);
            }
            return this.e.getResources().getColor(R.color.xm_sdk_chat_msg_text_color_right);
        }
        return this.e.getResources().getColor(R.color.xm_sdk_chat_voice_dur_text);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public int getLinkColor(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45bff7720b8cd2eda722c275ec7549b9", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45bff7720b8cd2eda722c275ec7549b9")).intValue();
        }
        int i = R.color.xm_sdk_in_link_message_color;
        if (bVar.g == 1) {
            i = R.color.xm_sdk_out_link_message_color;
        }
        return this.e.getResources().getColor(i);
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.ICommonTextAdapter
    public int getTextFontSize(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a68989e1007c364c3acd6d400704d7e", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a68989e1007c364c3acd6d400704d7e")).intValue();
        }
        int a2 = MsgViewType.a(bVar.b);
        if (a2 != 1) {
            if (a2 == 11) {
                return this.e.getResources().getDimensionPixelSize(R.dimen.xm_sdk_event_msg_text_size);
            }
            return this.e.getResources().getDimensionPixelSize(R.dimen.xm_sdk_text_msg_text_size);
        }
        return this.e.getResources().getDimensionPixelSize(R.dimen.xm_sdk_audio_msg_text_size);
    }
}
