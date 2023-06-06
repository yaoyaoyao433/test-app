package com.meituan.android.ptcommonim.pageadapter.base;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.ptcommonim.PTSessionFragment;
import com.meituan.android.ptcommonim.feedback.FeedbackCard;
import com.meituan.android.ptcommonim.feedback.model.PTQuestionSubmitParam;
import com.meituan.android.ptcommonim.pageadapter.message.item.g;
import com.meituan.android.ptcommonim.pageadapter.message.mach.f;
import com.meituan.android.ptcommonim.pageadapter.message.utils.b;
import com.meituan.android.ptcommonim.pageadapter.message.view.PTIMMachRootView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonHelper;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.imui.session.SessionFragment;
import com.sankuai.xm.imui.session.event.e;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a implements g {
    public static ChangeQuickRedirect a;
    protected final Context b;
    public final Map<String, com.meituan.android.ptcommonim.pageadapter.message.item.a> c;
    private final b d;
    private com.meituan.android.ptcommonim.model.b e;
    private final Map<String, Pair<GeneralMessage, PTQuestionSubmitParam>> f;

    public abstract Map<String, Object> a(GeneralMessage generalMessage, Map<String, Object> map);

    public abstract void a(Context context, f.a aVar);

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60f5c5401ff1764746c31c774371c99e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60f5c5401ff1764746c31c774371c99e");
            return;
        }
        this.c = new HashMap();
        this.f = new HashMap();
        this.b = context;
        this.d = new b(this.b, this);
        com.sankuai.xm.imui.session.b b = com.sankuai.xm.imui.session.b.b(context);
        if (b != null) {
            b.a(e.a.class, this.d, false);
            SessionFragment a2 = com.sankuai.xm.imui.session.b.a(context);
            if ((a2 instanceof PTSessionFragment) && a2.isAdded()) {
                this.e = ((PTSessionFragment) a2).h();
            }
        }
    }

    @Override // com.meituan.android.ptcommonim.pageadapter.message.item.g
    public final Map<String, com.meituan.android.ptcommonim.pageadapter.message.item.a> a() {
        return this.c;
    }

    @Override // com.meituan.android.ptcommonim.pageadapter.message.item.g
    public final void a(EventMessage eventMessage) {
        Object[] objArr = {eventMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fb4b42259d0f3ac76d57273eb946d22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fb4b42259d0f3ac76d57273eb946d22");
            return;
        }
        Context context = this.b;
        String text = eventMessage.getText();
        Object[] objArr2 = {context, text};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.ptcommonim.utils.f.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c98ccfd631eb429c912dfa2f1bfc6aa0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c98ccfd631eb429c912dfa2f1bfc6aa0");
            return;
        }
        Map<String, Object> a2 = com.meituan.android.ptcommonim.utils.f.a(context);
        a2.put("item_title", text);
        Statistics.getChannel("group").writeModelView("pt_common_im_page", "b_group_ooeqh8a7_mv", a2, "c_group_hjkzttqg");
    }

    public final View a(Context context, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adf9f2ac557fa1c1d24ddcff60daccb3", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adf9f2ac557fa1c1d24ddcff60daccb3");
        }
        if ("tmp_evaluate".equals(com.meituan.android.ptcommonim.utils.e.a(bVar.a()))) {
            com.meituan.android.ptcommonim.feedback.e a2 = com.meituan.android.ptcommonim.feedback.e.a();
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.ptcommonim.feedback.e.a;
            return PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "9b64d361596145c439e6f63d51b8ec50", RobustBitConfig.DEFAULT_VALUE) ? (FeedbackCard) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "9b64d361596145c439e6f63d51b8ec50") : new FeedbackCard(context);
        }
        return PTIMMachRootView.a(context, viewGroup);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r22, com.sankuai.xm.imui.session.entity.b<com.sankuai.xm.im.message.bean.GeneralMessage> r23) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.ptcommonim.pageadapter.base.a.a(android.view.View, com.sankuai.xm.imui.session.entity.b):void");
    }

    private Map<String, Object> a(com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f3ef00af6ec5c8cf8a21a679b88de8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f3ef00af6ec5c8cf8a21a679b88de8d");
        }
        try {
            return (Map) JsonHelper.fromJsonString(new String(bVar.a().getData()), Map.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
