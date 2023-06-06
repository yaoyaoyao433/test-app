package com.meituan.android.ptcommonim.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.android.ptcommonim.feedback.model.PTQuestionData;
import com.meituan.android.ptcommonim.widget.PTFeedbackScoreView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTFeedbackScoreLayout extends LinearLayout {
    public static ChangeQuickRedirect a;
    private rx.functions.c<Integer, PTQuestionData.QuestionInfo> b;
    private int c;

    public PTFeedbackScoreLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e38ea579fdfb15aa36dc1f6c7be37bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e38ea579fdfb15aa36dc1f6c7be37bc");
            return;
        }
        this.c = -1;
        a(context);
    }

    public PTFeedbackScoreLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45fa88644635f5a41ba82dde51f2edac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45fa88644635f5a41ba82dde51f2edac");
            return;
        }
        this.c = -1;
        a(context);
    }

    public PTFeedbackScoreLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55ea1684abfa839c909d257694dbe7e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55ea1684abfa839c909d257694dbe7e6");
            return;
        }
        this.c = -1;
        a(context);
    }

    private void a(Context context) {
        List<PTFeedbackScoreView.a> b;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b5665f40565184b60a1f9648a932104", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b5665f40565184b60a1f9648a932104");
            return;
        }
        setGravity(48);
        setOrientation(0);
        setWeightSum(5.0f);
        for (int i = 0; i < 5; i++) {
            PTFeedbackScoreView pTFeedbackScoreView = new PTFeedbackScoreView(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
            layoutParams.weight = 1.0f;
            pTFeedbackScoreView.setLayoutParams(layoutParams);
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            pTFeedbackScoreView.setOnScoreClickListener(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6a5cfd6a465fd17f21de06d9f75313d4", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.d) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6a5cfd6a465fd17f21de06d9f75313d4") : new c(this));
            addView(pTFeedbackScoreView);
        }
        if (isInEditMode() || (b = b(context)) == null) {
            return;
        }
        a(b);
    }

    public static /* synthetic */ void a(PTFeedbackScoreLayout pTFeedbackScoreLayout, PTFeedbackScoreView pTFeedbackScoreView, Integer num, PTQuestionData.QuestionInfo questionInfo) {
        int childCount;
        Object[] objArr = {pTFeedbackScoreLayout, pTFeedbackScoreView, num, questionInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c23949d9b293fdb275fa7320ffc37a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c23949d9b293fdb275fa7320ffc37a9");
            return;
        }
        Object[] objArr2 = {pTFeedbackScoreView};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, pTFeedbackScoreLayout, changeQuickRedirect2, false, "ed8951ade7afffb71d19fd09c2009fdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, pTFeedbackScoreLayout, changeQuickRedirect2, false, "ed8951ade7afffb71d19fd09c2009fdc");
        } else if (pTFeedbackScoreView != null && (childCount = pTFeedbackScoreLayout.getChildCount()) > 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = pTFeedbackScoreLayout.getChildAt(i);
                if (childAt instanceof PTFeedbackScoreView) {
                    PTFeedbackScoreView pTFeedbackScoreView2 = (PTFeedbackScoreView) childAt;
                    if (pTFeedbackScoreView2.isSelected()) {
                        if (pTFeedbackScoreView2 != pTFeedbackScoreView) {
                            pTFeedbackScoreView2.setSelected(false);
                        }
                    } else if (pTFeedbackScoreView2 == pTFeedbackScoreView) {
                        pTFeedbackScoreView2.setSelected(true);
                    }
                }
            }
        }
        pTFeedbackScoreLayout.c = num.intValue();
        if (pTFeedbackScoreLayout.b != null) {
            pTFeedbackScoreLayout.b.a(num, questionInfo);
        }
    }

    public void setOnScoreSelectListener(rx.functions.c<Integer, PTQuestionData.QuestionInfo> cVar) {
        this.b = cVar;
    }

    public final void a(List<PTFeedbackScoreView.a> list) {
        int childCount;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4607e0e78ef2f81e9a9087b0da40e6eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4607e0e78ef2f81e9a9087b0da40e6eb");
        } else if (!CollectionUtils.isEmpty(list) && list.size() == (childCount = getChildCount())) {
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof PTFeedbackScoreView) {
                    PTFeedbackScoreView pTFeedbackScoreView = (PTFeedbackScoreView) childAt;
                    PTFeedbackScoreView.a aVar = list.get(i);
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = PTFeedbackScoreView.a;
                    if (PatchProxy.isSupport(objArr2, pTFeedbackScoreView, changeQuickRedirect2, false, "7894924a044d34d67da6567604962419", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, pTFeedbackScoreView, changeQuickRedirect2, false, "7894924a044d34d67da6567604962419");
                    } else if (aVar != null) {
                        Object[] objArr3 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect3 = PTFeedbackScoreView.a;
                        if (PatchProxy.isSupport(objArr3, pTFeedbackScoreView, changeQuickRedirect3, false, "45222379c5469e3eaf4a1130346b0110", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, pTFeedbackScoreView, changeQuickRedirect3, false, "45222379c5469e3eaf4a1130346b0110");
                        } else if (aVar != null) {
                            pTFeedbackScoreView.b.b = aVar.b;
                            pTFeedbackScoreView.b.g = aVar.g;
                            pTFeedbackScoreView.b.c = aVar.c;
                            pTFeedbackScoreView.b.d = aVar.d;
                            pTFeedbackScoreView.b.h = aVar.h;
                            pTFeedbackScoreView.b.e = aVar.e;
                            pTFeedbackScoreView.b.f = aVar.f;
                            pTFeedbackScoreView.b.i = aVar.i;
                        }
                        pTFeedbackScoreView.setSelected(aVar.h);
                        pTFeedbackScoreView.setTitle(aVar.g);
                    }
                }
            }
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39e92a2fc5cfd5d2751e49cdaa0a19bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39e92a2fc5cfd5d2751e49cdaa0a19bc");
            return;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            PTFeedbackScoreView pTFeedbackScoreView = (PTFeedbackScoreView) getChildAt(i2);
            if (pTFeedbackScoreView.getScore() == i) {
                pTFeedbackScoreView.performClick();
                return;
            }
        }
    }

    public void setInteractable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7657dae02de9c21b3a20097700e4f3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7657dae02de9c21b3a20097700e4f3e");
            return;
        }
        int childCount = getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; i++) {
                PTFeedbackScoreView pTFeedbackScoreView = (PTFeedbackScoreView) getChildAt(i);
                if (pTFeedbackScoreView != null) {
                    pTFeedbackScoreView.setEnabled(z);
                }
            }
        }
    }

    private static List<PTFeedbackScoreView.a> b(Context context) {
        String[] stringArray;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b89efddda2a0928c263cc04438fc6571", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b89efddda2a0928c263cc04438fc6571");
        }
        if (context == null || (stringArray = context.getResources().getStringArray(R.array.feedback_score_title)) == null || stringArray.length != 5) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < 5) {
            PTFeedbackScoreView.a aVar = new PTFeedbackScoreView.a();
            int i2 = i + 1;
            aVar.b = i2;
            aVar.h = false;
            aVar.c = R.drawable.ptim_round_bg_default;
            aVar.d = R.drawable.ptim_round_bg_default;
            aVar.e = com.meituan.android.ptcommonim.pageadapter.message.utils.d.b[i];
            aVar.f = com.meituan.android.ptcommonim.pageadapter.message.utils.d.a[i];
            aVar.g = stringArray[i];
            arrayList.add(aVar);
            i = i2;
        }
        return arrayList;
    }

    public int getSelectedScore() {
        if (this.c < 0) {
            return 3;
        }
        return this.c;
    }
}
