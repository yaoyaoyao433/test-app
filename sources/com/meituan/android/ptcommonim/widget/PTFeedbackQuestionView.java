package com.meituan.android.ptcommonim.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTFeedbackQuestionView extends LinearLayout {
    public static ChangeQuickRedirect a;
    boolean b;
    private TextView c;
    private PTFeedbackTagView d;
    private PTFeedbackTagView e;
    private rx.functions.b<Boolean> f;
    private rx.functions.c<String, Object> g;

    public PTFeedbackQuestionView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5adaaaa800013202c6c0aed6caec2a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5adaaaa800013202c6c0aed6caec2a1");
            return;
        }
        this.b = true;
        a(context);
    }

    public PTFeedbackQuestionView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9762587ff2a60695f8d660628d91dcd4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9762587ff2a60695f8d660628d91dcd4");
            return;
        }
        this.b = true;
        a(context);
    }

    public PTFeedbackQuestionView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b53023c82f690081499bf98f1c12367", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b53023c82f690081499bf98f1c12367");
            return;
        }
        this.b = true;
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3647b6028a8f542177810f3d74c1e80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3647b6028a8f542177810f3d74c1e80");
            return;
        }
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.ptim_feedback_question_layout, this);
        this.c = (TextView) findViewById(R.id.solve_question_title);
        this.d = (PTFeedbackTagView) findViewById(R.id.solve_question_yes);
        this.e = (PTFeedbackTagView) findViewById(R.id.solve_question_no);
        setSolved(this.b);
        this.d.setTagText(getResources().getString(R.string.ptim_solve_question_yes));
        this.d.setOnClickListener(a.a(this));
        this.e.setTagText(getResources().getString(R.string.ptim_solve_question_no));
        this.e.setOnClickListener(b.a(this));
    }

    public static /* synthetic */ void b(PTFeedbackQuestionView pTFeedbackQuestionView, View view) {
        Object[] objArr = {pTFeedbackQuestionView, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1805c4e43aeb6a68675093fb6502bf91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1805c4e43aeb6a68675093fb6502bf91");
            return;
        }
        pTFeedbackQuestionView.setSolved(true);
        if (pTFeedbackQuestionView.f != null) {
            pTFeedbackQuestionView.f.call(Boolean.TRUE);
        }
        if (pTFeedbackQuestionView.g != null) {
            pTFeedbackQuestionView.g.a("tag_solve_switch", 1);
        }
    }

    public static /* synthetic */ void a(PTFeedbackQuestionView pTFeedbackQuestionView, View view) {
        Object[] objArr = {pTFeedbackQuestionView, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b50ef622201784f0bb3ea63632078e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b50ef622201784f0bb3ea63632078e2");
            return;
        }
        pTFeedbackQuestionView.setSolved(false);
        if (pTFeedbackQuestionView.f != null) {
            pTFeedbackQuestionView.f.call(Boolean.FALSE);
        }
        if (pTFeedbackQuestionView.g != null) {
            pTFeedbackQuestionView.g.a("tag_solve_switch", 0);
        }
    }

    public void setSolved(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7c027c7d55e106c438e77947440ccfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7c027c7d55e106c438e77947440ccfe");
            return;
        }
        if (z) {
            this.d.setTagSelected(true);
            this.e.setTagSelected(false);
        } else {
            this.d.setTagSelected(false);
            this.e.setTagSelected(true);
        }
        this.b = z;
    }

    public void setInteractable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "478601683c5c33757237d7a25df5e96f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "478601683c5c33757237d7a25df5e96f");
            return;
        }
        if (this.d != null) {
            this.d.setInteractable(z);
        }
        if (this.e != null) {
            this.e.setInteractable(z);
        }
    }
}
