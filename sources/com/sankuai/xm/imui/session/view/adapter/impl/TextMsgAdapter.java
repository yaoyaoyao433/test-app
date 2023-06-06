package com.sankuai.xm.imui.session.view.adapter.impl;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.imui.common.processors.f;
import com.sankuai.xm.imui.common.util.l;
import com.sankuai.xm.imui.common.view.LinkTextView;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
import com.sankuai.xm.imui.session.view.adapter.ITextMsgAdapter;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TextMsgAdapter extends BaseMsgAdapter implements ITextMsgAdapter {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        public LinkTextView a;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IExtraViewAdapter
    @NonNull
    public View createView(Context context, b<TextMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4a502ce8e00f23d177ae3a5db919e45", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4a502ce8e00f23d177ae3a5db919e45");
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.xm_sdk_chat_text_msg, viewGroup);
        a aVar = new a();
        aVar.a = (LinkTextView) inflate.findViewById(R.id.xm_sdk_tv_chat_txt_msg);
        inflate.setTag(aVar);
        return inflate;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IExtraViewAdapter
    public void bindView(View view, final b<TextMessage> bVar) {
        CharSequence charSequence;
        boolean z;
        ICommonAdapter b;
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43c04e3e68868153ea87d3095068192c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43c04e3e68868153ea87d3095068192c");
            return;
        }
        a aVar = (a) view.getTag();
        final LinkTextView linkTextView = aVar.a;
        Object[] objArr2 = {linkTextView, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ac26ea20932c77f66649e5ffb9e2b94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ac26ea20932c77f66649e5ffb9e2b94");
        } else if (linkTextView != null) {
            final ICommonAdapter b2 = com.sankuai.xm.imui.session.b.b(linkTextView);
            linkTextView.setOnLinkClickListener(new LinkTextView.b() { // from class: com.sankuai.xm.imui.session.view.adapter.impl.TextMsgAdapter.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.imui.common.view.LinkTextView.b
                public final boolean a(String str) {
                    Object[] objArr3 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "786d112aea80661a3aa5097abdf02a3f", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "786d112aea80661a3aa5097abdf02a3f")).booleanValue();
                    }
                    if (b2 != null) {
                        linkTextView.setTag(bVar);
                        return b2.onTextLinkClick(linkTextView, str);
                    }
                    return false;
                }
            });
            linkTextView.setOnLongClickListener(l.b);
            linkTextView.setOnLongLinkClickListener(new LinkTextView.c() { // from class: com.sankuai.xm.imui.session.view.adapter.impl.TextMsgAdapter.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.imui.common.view.LinkTextView.c
                public final boolean a(Object obj) {
                    Object[] objArr3 = {obj};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "64e4cff0999db413efe3b2d8ebe89074", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "64e4cff0999db413efe3b2d8ebe89074")).booleanValue();
                    }
                    if (b2 != null) {
                        return b2.onLongClick(linkTextView, bVar);
                    }
                    return false;
                }
            });
            Object[] objArr3 = {bVar, linkTextView, b2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3f9c5b2338b95e488a203546be6162d5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3f9c5b2338b95e488a203546be6162d5");
            } else if (linkTextView != null && b2 != null) {
                linkTextView.setTextColor(b2.getTextColor(bVar));
                linkTextView.setTextSize(0, b2.getTextFontSize(bVar));
                linkTextView.setLineSpacing(b2.getLineSpacingExtra(bVar), 1.0f);
            }
        }
        LinkTextView linkTextView2 = aVar.a;
        Object[] objArr4 = {linkTextView2, bVar};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "94287d7a76022382cdaca9f810c190a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "94287d7a76022382cdaca9f810c190a0");
        } else if (linkTextView2 != null) {
            Object[] objArr5 = {linkTextView2, bVar};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "311f82fd5033adbbe4c9c89cd332a4d6", 6917529027641081856L)) {
                charSequence = (CharSequence) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "311f82fd5033adbbe4c9c89cd332a4d6");
            } else if (bVar == null || bVar.b == null || bVar.b.getText() == null) {
                charSequence = "";
            } else {
                int i = -1;
                Set<String> hashSet = new HashSet<>();
                if (linkTextView2 == null || (b = com.sankuai.xm.imui.session.b.b(linkTextView2)) == null) {
                    z = true;
                } else {
                    i = b.getLinkColor(bVar);
                    z = b.hasLinkTextUnderLine(bVar);
                    hashSet = b.getTextLinkSchema();
                }
                charSequence = f.b().a().a(z).a(i).a(hashSet).b(this.e.getResources().getDimensionPixelSize(R.dimen.xm_sdk_text_msg_text_size)).a(bVar.b.getText());
            }
            linkTextView2.setText(charSequence);
        }
    }
}
