package com.sankuai.xm.imui.session.view;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.EmotionMessage;
import com.sankuai.xm.imui.common.entity.a;
import com.sankuai.xm.imui.common.processors.c;
import com.sankuai.xm.imui.common.view.AdaptiveImageView;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.IEmotionMsgAdapter;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class EmotionMsgView extends BaseCommonView<EmotionMessage, IEmotionMsgAdapter> {
    public static ChangeQuickRedirect a;
    private AdaptiveImageView s;
    private TextView t;
    private c u;

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public int getContentLayoutResourceId() {
        return R.layout.xm_sdk_chatmsg_emotion_content;
    }

    public EmotionMsgView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34576f4bcff03a38806edba9c2c6a099", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34576f4bcff03a38806edba9c2c6a099");
        }
    }

    public EmotionMsgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86f82762923cbd64a5373e1831502dcd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86f82762923cbd64a5373e1831502dcd");
        }
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(View view, b<EmotionMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "853b5439eb22cafb31de6834184a1de0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "853b5439eb22cafb31de6834184a1de0");
            return;
        }
        this.s = (AdaptiveImageView) view.findViewById(R.id.xm_sdk_iv_chat_emotion);
        this.t = (TextView) view.findViewById(R.id.xm_sdk_tv_chat_emotion_default);
        a(bVar, this.t);
    }

    public void setEmotionProcessor(c cVar) {
        this.u = cVar;
    }

    @Override // com.sankuai.xm.imui.session.view.BaseCommonView
    public final void a(b<EmotionMessage> bVar) {
        int i;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8861c5ebdafe1c893052e3a88aa250ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8861c5ebdafe1c893052e3a88aa250ff");
            return;
        }
        super.a(bVar);
        EmotionMessage emotionMessage = bVar.b;
        Object[] objArr2 = {emotionMessage};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a8e5669eee5695176fb3d7a9e29b891a", 6917529027641081856L)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a8e5669eee5695176fb3d7a9e29b891a")).intValue();
        } else {
            if (emotionMessage != null && this.u != null && !com.sankuai.xm.base.util.b.a(this.u.a())) {
                loop0: for (com.sankuai.xm.imui.common.entity.a aVar : this.u.a()) {
                    if (aVar != null && aVar.d != 1 && !com.sankuai.xm.base.util.b.a(aVar.m) && (TextUtils.isEmpty(emotionMessage.getGroup()) || TextUtils.equals(aVar.e, emotionMessage.getGroup()))) {
                        for (a.C1398a c1398a : aVar.m) {
                            if (c1398a != null && TextUtils.equals(emotionMessage.getName(), c1398a.c)) {
                                i = c1398a.b;
                                break loop0;
                            }
                        }
                        continue;
                    }
                }
            }
            i = -1;
        }
        if (i == -1) {
            this.t.setVisibility(0);
            this.s.setVisibility(8);
            this.t.setText(this.o.getString(R.string.xm_sdk_msg_emotion_big, bVar.b.getName()));
            return;
        }
        this.t.setVisibility(8);
        this.s.setVisibility(0);
        this.s.setBackground(null);
        this.s.setImageResource(i);
    }
}
