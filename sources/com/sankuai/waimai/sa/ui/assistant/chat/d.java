package com.sankuai.waimai.sa.ui.assistant.chat;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.sa.ui.assistant.view.FastReplyView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends b implements h {
    public static ChangeQuickRedirect d;
    com.sankuai.waimai.sa.model.b e;
    Activity f;
    private final com.sankuai.waimai.sa.ui.assistant.a g;
    private final k h;
    private final TextView i;
    private final TextView j;
    private final LinearLayout k;
    private final RecyclerView l;
    private final m m;
    private final String n;
    private i o;
    private g p;
    private FastReplyView q;
    private FrameLayout r;
    private FastReplyView s;
    private ImageView t;
    private RecyclerView.k u;

    public static /* synthetic */ boolean a(d dVar, View view, Context context) {
        Object[] objArr = {view, context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "5a2bcb7efdaedba15efed4882cef3a03", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "5a2bcb7efdaedba15efed4882cef3a03")).booleanValue();
        }
        if (view == null || dVar.l == null || context == null) {
            return false;
        }
        int top = dVar.l.getTop();
        int bottom = dVar.l.getBottom();
        int left = dVar.l.getLeft();
        int right = dVar.l.getRight();
        int top2 = view.getTop();
        int bottom2 = view.getBottom();
        int left2 = view.getLeft();
        int right2 = view.getRight();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        dVar.l.getLocationOnScreen(iArr2);
        return new Rect(iArr2[0], iArr2[1], (right - left) + iArr2[0], (bottom - top) + iArr2[1]).intersect(new Rect(iArr[0], iArr[1], (right2 - left2) + iArr[0], (bottom2 - top2) + iArr[1]));
    }

    public d(Activity activity, FrameLayout frameLayout, FastReplyView fastReplyView, LinearLayout linearLayout, RecyclerView recyclerView, @NonNull com.sankuai.waimai.sa.ui.assistant.a aVar, k kVar, m mVar, i iVar, l lVar, String str) {
        super(linearLayout);
        Object[] objArr = {activity, frameLayout, fastReplyView, linearLayout, recyclerView, aVar, kVar, mVar, iVar, lVar, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b316f15ed8f992022a73c12cde725f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b316f15ed8f992022a73c12cde725f2");
            return;
        }
        this.u = new RecyclerView.k() { // from class: com.sankuai.waimai.sa.ui.assistant.chat.d.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Removed duplicated region for block: B:48:0x01bb  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x01bf  */
            @Override // android.support.v7.widget.RecyclerView.k
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onScrolled(android.support.v7.widget.RecyclerView r23, int r24, int r25) {
                /*
                    Method dump skipped, instructions count: 586
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.sa.ui.assistant.chat.d.AnonymousClass1.onScrolled(android.support.v7.widget.RecyclerView, int, int):void");
            }
        };
        this.f = activity;
        this.l = recyclerView;
        this.k = linearLayout;
        this.i = (TextView) linearLayout.findViewById(R.id.sa_chat_item_question);
        this.j = (TextView) linearLayout.findViewById(R.id.sa_chat_item_answer_title);
        this.t = (ImageView) linearLayout.findViewById(R.id.sa_logo);
        this.g = aVar;
        this.h = kVar;
        this.m = mVar;
        this.o = iVar;
        this.n = str;
        this.q = (FastReplyView) LayoutInflater.from(this.f).inflate(R.layout.wm_smart_assistant_fast_reply_button, (ViewGroup) null);
        this.q.setItemViewCacheSize(30);
        this.q.setSelectedListener(lVar);
        this.q.setRemoveReplyListener(this);
        recyclerView.addOnScrollListener(this.u);
        this.r = frameLayout;
        this.s = fastReplyView;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:96:0x030d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.util.Pair<com.sankuai.waimai.sa.ui.assistant.chat.k.a, com.sankuai.waimai.sa.model.b> r21, android.util.Pair<com.sankuai.waimai.sa.ui.assistant.chat.k.a, com.sankuai.waimai.sa.model.b> r22, int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 1324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.sa.ui.assistant.chat.d.a(android.util.Pair, android.util.Pair, int, boolean):void");
    }

    private void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "342df0fbdc3c1348d96f9877ae45769c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "342df0fbdc3c1348d96f9877ae45769c");
            return;
        }
        this.k.removeView(this.q);
        if (this.e == null || this.e.m == null || this.e.m.a == null || !z) {
            return;
        }
        if (this.e.a != 7 || this.e.b != 1 || this.e.p == null || this.e.p.size() <= 1) {
            if (i == 2) {
                this.q.setPadding(0, com.sankuai.waimai.foundation.utils.g.a(this.f, 7.0f), 0, 0);
            } else if (i == 1) {
                this.q.setPadding(0, com.sankuai.waimai.foundation.utils.g.a(this.f, 7.0f), 0, 0);
            } else {
                this.q.setPadding(0, 0, 0, 0);
            }
            this.k.addView(this.q, -1);
            FastReplyView fastReplyView = this.q;
            com.sankuai.waimai.sa.model.f fVar = this.e.m;
            StringBuilder sb = new StringBuilder();
            sb.append(this.e.c);
            fastReplyView.a(fVar, sb.toString());
        }
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.chat.h
    public final void a(FastReplyView fastReplyView) {
        Object[] objArr = {fastReplyView};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ecbe19b1537e29b21a7f5822bcdaa5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ecbe19b1537e29b21a7f5822bcdaa5b");
            return;
        }
        this.k.removeView(fastReplyView);
        this.r.removeView(fastReplyView);
        if (this.e == null || this.e.k == null || this.e.k.c != 1) {
            return;
        }
        this.e.k = null;
        this.e.a = 0;
    }
}
