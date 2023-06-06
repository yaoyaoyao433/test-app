package com.meituan.android.ptcommonim.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.android.ptcommonim.feedback.model.PTQuestionData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ColorUtils;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTFeedbackTagView extends FrameLayout {
    public static ChangeQuickRedirect a;
    private AppCompatTextView b;
    private PTQuestionData.QuestionTag c;
    private boolean d;
    private rx.functions.c<Boolean, PTQuestionData.QuestionTag> e;

    public PTFeedbackTagView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdff8d410ccfcbe78b57f55d12c63a2e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdff8d410ccfcbe78b57f55d12c63a2e");
            return;
        }
        this.d = false;
        a();
    }

    public PTFeedbackTagView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7438eea79da18a701953401553b20a38", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7438eea79da18a701953401553b20a38");
            return;
        }
        this.d = false;
        a();
    }

    public PTFeedbackTagView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44aeb470b936953f579efe79f901b649", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44aeb470b936953f579efe79f901b649");
            return;
        }
        this.d = false;
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b847e674dcd74adf750d5191aab44566", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b847e674dcd74adf750d5191aab44566");
            return;
        }
        this.b = new AppCompatTextView(getContext());
        this.b.setLayoutParams(new FrameLayout.LayoutParams(-1, com.meituan.android.ptcommonim.base.util.a.a(28)));
        this.b.setBackgroundResource(R.drawable.ptim_tag_unselected_bg);
        this.b.setGravity(17);
        this.b.setMaxLines(1);
        setOnClickListener(f.a(this));
        addView(this.b);
    }

    public static /* synthetic */ void a(PTFeedbackTagView pTFeedbackTagView, View view) {
        Object[] objArr = {pTFeedbackTagView, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a228e62ec1f5eb19a20e2b6cb5e0f622", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a228e62ec1f5eb19a20e2b6cb5e0f622");
            return;
        }
        pTFeedbackTagView.setTagSelected(!pTFeedbackTagView.d);
        if (pTFeedbackTagView.e != null) {
            pTFeedbackTagView.e.a(Boolean.valueOf(pTFeedbackTagView.getTagSelected()), pTFeedbackTagView.c);
        }
    }

    public void setTagSelected(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8306da7d1d3b4f7e6bf458aa805b7d94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8306da7d1d3b4f7e6bf458aa805b7d94");
            return;
        }
        if (z) {
            this.b.setBackgroundResource(R.drawable.ptim_tag_selected_bg);
            this.b.setTextColor(ColorUtils.parseColor("#FF000000", -16777216));
        } else {
            this.b.setBackgroundResource(R.drawable.ptim_tag_unselected_bg);
            this.b.setTextColor(ColorUtils.parseColor("#99000000", -1728053248));
        }
        this.d = z;
    }

    public boolean getTagSelected() {
        return this.d;
    }

    public void setTagSelectedListener(rx.functions.c<Boolean, PTQuestionData.QuestionTag> cVar) {
        this.e = cVar;
    }

    public String getTagName() {
        if (this.c != null) {
            return this.c.labelName;
        }
        return null;
    }

    public void setTagText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcc3c51b7410fbfc8e83df05648fa622", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcc3c51b7410fbfc8e83df05648fa622");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.b.setText("");
        }
        if (str.length() > 8) {
            str = str.substring(0, 9);
        }
        this.b.setText(str);
    }

    public void setTagData(PTQuestionData.QuestionTag questionTag) {
        Object[] objArr = {questionTag};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f7cc1d46ae0de1ae16b3e92b344967e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f7cc1d46ae0de1ae16b3e92b344967e");
        } else if (questionTag == null) {
        } else {
            this.c = questionTag;
            setTagText(this.c.labelName);
        }
    }

    public void setInteractable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "468e631506e1486b780dde81a473854d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "468e631506e1486b780dde81a473854d");
        } else {
            setEnabled(z);
        }
    }
}
