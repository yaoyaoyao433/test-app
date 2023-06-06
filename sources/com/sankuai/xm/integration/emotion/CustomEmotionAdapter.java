package com.sankuai.xm.integration.emotion;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.util.ActivityUtils;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.base.util.n;
import com.sankuai.xm.im.f;
import com.sankuai.xm.im.message.bean.CustomEmotionMessage;
import com.sankuai.xm.imui.common.view.AdaptiveImageView;
import com.sankuai.xm.imui.session.view.adapter.IExtraViewAdapter;
import com.sankuai.xm.imui.session.view.adapter.impl.BaseMsgAdapter;
import com.sankuai.xm.log.c;
import com.sankuai.xm.ui.service.b;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class CustomEmotionAdapter extends BaseMsgAdapter implements IExtraViewAdapter<CustomEmotionMessage> {
    public static ChangeQuickRedirect a;
    private com.sankuai.xm.ui.service.b b;

    public CustomEmotionAdapter(com.sankuai.xm.ui.service.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c376a043c1e9fc5dcf4a8eaaf0fc873a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c376a043c1e9fc5dcf4a8eaaf0fc873a");
        } else {
            this.b = bVar;
        }
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IExtraViewAdapter
    @NonNull
    public View createView(Context context, com.sankuai.xm.imui.session.entity.b<CustomEmotionMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3754eec4cbe6711d226e11e04e276f65", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3754eec4cbe6711d226e11e04e276f65");
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.xm_sdk_emotion_msg_content, viewGroup, false);
        a aVar = new a();
        aVar.a = (AdaptiveImageView) inflate.findViewById(R.id.xm_sdk_iv_chat_emotion);
        aVar.a.setPlaceHolderRes(R.drawable.xm_sdk_chat_msg_img_loading);
        inflate.setTag(aVar);
        return inflate;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IExtraViewAdapter
    public void bindView(View view, com.sankuai.xm.imui.session.entity.b<CustomEmotionMessage> bVar) {
        boolean z = false;
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0af6f710f186333c7ebee5b83eeeb530", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0af6f710f186333c7ebee5b83eeeb530");
            return;
        }
        a aVar = (a) view.getTag();
        aVar.b = bVar;
        aVar.c = bVar.b;
        if (this.b != null) {
            Object[] objArr2 = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "066cf6f2f1b958959dbf0613e9b2f878", 6917529027641081856L)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "066cf6f2f1b958959dbf0613e9b2f878")).booleanValue();
            } else if (bVar != null && bVar.o.getInt(a(bVar.b), -1) == 7) {
                z = true;
            }
            if (!z) {
                aVar.d = this.b.a(aVar.c.getPackageId(), aVar.c.getId(), 4);
                if (k.o(aVar.d)) {
                    a(aVar);
                    return;
                } else {
                    c(aVar);
                    return;
                }
            }
        }
        b(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(CustomEmotionMessage customEmotionMessage) {
        Object[] objArr = {customEmotionMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "817f402c1199c3af633bb9c8718d3498", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "817f402c1199c3af633bb9c8718d3498");
        }
        return "xm_sdk_" + customEmotionMessage.getPackageId() + CommonConstant.Symbol.UNDERLINE + customEmotionMessage.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52bd506b066a96efc8613e77ce26a5b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52bd506b066a96efc8613e77ce26a5b2");
            return;
        }
        aVar.a.setBackground(null);
        aVar.a.a(com.sankuai.xm.integration.imageloader.utils.a.a(aVar.d), Boolean.valueOf(n.i(aVar.c.getType())));
        aVar.a.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.integration.emotion.CustomEmotionAdapter.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "89cf6a3926036d783cb9c7c1c7836dfa", 6917529027641081858L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "89cf6a3926036d783cb9c7c1c7836dfa");
                } else if (CustomEmotionAdapter.this.b != null) {
                    CustomEmotionAdapter.this.b.a(aVar.c.getPackageId(), aVar.c.getId(), 4, aVar.d, null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a1629fd71141c5db015c30de2da4993", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a1629fd71141c5db015c30de2da4993");
        } else if (aVar == null || aVar.a == null || !ActivityUtils.a(ActivityUtils.a(this.e))) {
        } else {
            int a2 = com.sankuai.xm.imui.common.util.k.a(this.e, 24.0f);
            int a3 = com.sankuai.xm.imui.common.util.k.a(this.e, 42.0f);
            aVar.a.setBackgroundResource(R.drawable.xm_sdk_chat_msg_img_holder_bg);
            aVar.a.a(R.drawable.xm_sdk_ic_emotion_failed, a2, a3);
            aVar.a.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.integration.emotion.CustomEmotionAdapter.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "06facb5f3bd962688605f4bf25b41a7e", 6917529027641081858L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "06facb5f3bd962688605f4bf25b41a7e");
                        return;
                    }
                    aVar.b.o.remove(CustomEmotionAdapter.this.a(aVar.c));
                    CustomEmotionAdapter.this.c(aVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public AdaptiveImageView a;
        public com.sankuai.xm.imui.session.entity.b<CustomEmotionMessage> b;
        public CustomEmotionMessage c;
        public String d;

        public a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bdf8c47ec94a4afc5966795b1fc57c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bdf8c47ec94a4afc5966795b1fc57c3");
            return;
        }
        int a2 = com.sankuai.xm.imui.common.util.k.a(this.e, 20.0f);
        aVar.a.a(R.drawable.xm_sdk_progress_loading, a2, a2);
        if (this.b == null) {
            return;
        }
        final WeakReference weakReference = new WeakReference(aVar);
        this.b.a(aVar.c.getPackageId(), aVar.c.getId(), 4, aVar.d, new f<b.a>() { // from class: com.sankuai.xm.integration.emotion.CustomEmotionAdapter.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.im.f
            public final /* synthetic */ void a(b.a aVar2) {
                b.a aVar3 = aVar2;
                Object[] objArr2 = {aVar3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e517bc5af7a284690886c4152f75cb0", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e517bc5af7a284690886c4152f75cb0");
                    return;
                }
                a aVar4 = (a) weakReference.get();
                if (aVar4 == null || aVar4.c == null || aVar3 == null || !ac.a(aVar3.d, aVar4.c.getPackageId()) || !ac.a(aVar3.e, aVar4.c.getId()) || !ActivityUtils.a(ActivityUtils.a(CustomEmotionAdapter.this.e))) {
                    return;
                }
                CustomEmotionAdapter.this.a(aVar4);
                aVar4.b.o.remove(CustomEmotionAdapter.this.a(aVar4.c));
            }

            @Override // com.sankuai.xm.im.f
            public final void a(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "787af993a8b9d637d02465008f75adee", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "787af993a8b9d637d02465008f75adee");
                    return;
                }
                c.d("CustomEmotionAdapter", "bindView::onFailure:: code:%s, message: %s", Integer.valueOf(i), str);
                a aVar2 = (a) weakReference.get();
                if (aVar2 != null) {
                    aVar2.b.o.putInt(CustomEmotionAdapter.this.a(aVar2.c), 7);
                }
                CustomEmotionAdapter.this.b(aVar2);
            }
        });
    }
}
