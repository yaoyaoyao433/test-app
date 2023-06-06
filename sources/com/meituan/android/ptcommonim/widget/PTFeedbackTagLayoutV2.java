package com.meituan.android.ptcommonim.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.meituan.android.base.ui.widget.TagsLayout;
import com.meituan.android.ptcommonim.feedback.model.PTQuestionData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.model.CollectionUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTFeedbackTagLayoutV2 extends TagsLayout {
    public static ChangeQuickRedirect b;
    private final List<PTFeedbackTagView> c;
    private final Set<String> d;
    private rx.functions.c<String, Object> e;

    public PTFeedbackTagLayoutV2(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe1c49a8027084aa8d92ca1ca8b0f38d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe1c49a8027084aa8d92ca1ca8b0f38d");
            return;
        }
        this.c = new ArrayList();
        this.d = new HashSet();
        a();
    }

    public PTFeedbackTagLayoutV2(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23840e017035f7fb9f8457e503df5833", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23840e017035f7fb9f8457e503df5833");
            return;
        }
        this.c = new ArrayList();
        this.d = new HashSet();
        a();
    }

    public PTFeedbackTagLayoutV2(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ceeaa7d45eaf242562a59b1bb9e0d394", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ceeaa7d45eaf242562a59b1bb9e0d394");
            return;
        }
        this.c = new ArrayList();
        this.d = new HashSet();
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44b4f99d812df49a3c84b7bc53dc4d94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44b4f99d812df49a3c84b7bc53dc4d94");
        } else {
            a(2, 1);
        }
    }

    public void setData(List<PTQuestionData.QuestionTag> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68822f86aff280c1d2817dc55ed181b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68822f86aff280c1d2817dc55ed181b4");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83abca1e5343ca21c29e1e0e3c36a1c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83abca1e5343ca21c29e1e0e3c36a1c4");
        } else {
            removeAllViews();
            this.d.clear();
            this.c.clear();
        }
        if (CollectionUtils.isEmpty(list)) {
            return;
        }
        for (int i = 0; i < list.size() && i < 6; i++) {
            PTQuestionData.QuestionTag questionTag = list.get(i);
            if (questionTag != null && !TextUtils.isEmpty(questionTag.labelName)) {
                PTFeedbackTagView pTFeedbackTagView = new PTFeedbackTagView(getContext());
                TagsLayout.a aVar = new TagsLayout.a(-2, -2);
                if (i % 2 == 0) {
                    pTFeedbackTagView.setPadding(0, com.meituan.android.ptcommonim.base.util.a.a(6), com.meituan.android.ptcommonim.base.util.a.a(7), com.meituan.android.ptcommonim.base.util.a.a(6));
                } else {
                    pTFeedbackTagView.setPadding(com.meituan.android.ptcommonim.base.util.a.a(7), com.meituan.android.ptcommonim.base.util.a.a(6), 0, com.meituan.android.ptcommonim.base.util.a.a(6));
                }
                pTFeedbackTagView.setLayoutParams(aVar);
                pTFeedbackTagView.setTagData(questionTag);
                pTFeedbackTagView.setTagSelected(false);
                Object[] objArr3 = {this};
                ChangeQuickRedirect changeQuickRedirect3 = e.a;
                pTFeedbackTagView.setTagSelectedListener(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ece0939ccc473faa34b2b1ccaedc2fb4", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.c) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ece0939ccc473faa34b2b1ccaedc2fb4") : new e(this));
                addView(pTFeedbackTagView);
                this.c.add(pTFeedbackTagView);
            }
        }
    }

    public static /* synthetic */ void a(PTFeedbackTagLayoutV2 pTFeedbackTagLayoutV2, Boolean bool, PTQuestionData.QuestionTag questionTag) {
        Object[] objArr = {pTFeedbackTagLayoutV2, bool, questionTag};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "029da7fd299d3a9f6a3276d2315860b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "029da7fd299d3a9f6a3276d2315860b2");
        } else if (questionTag == null || TextUtils.isEmpty(questionTag.labelName)) {
        } else {
            if (bool.booleanValue()) {
                pTFeedbackTagLayoutV2.d.add(questionTag.labelName);
            } else {
                pTFeedbackTagLayoutV2.d.remove(questionTag.labelName);
            }
            if (pTFeedbackTagLayoutV2.e != null) {
                pTFeedbackTagLayoutV2.e.a("tag_score_tag", null);
            }
        }
    }

    public final void a(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "436389cb67a92c269c2cc39b4e15b053", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "436389cb67a92c269c2cc39b4e15b053");
        } else if (!CollectionUtils.isEmpty(list) && !CollectionUtils.isEmpty(this.c)) {
            for (PTFeedbackTagView pTFeedbackTagView : this.c) {
                if (pTFeedbackTagView != null && !TextUtils.isEmpty(pTFeedbackTagView.getTagName()) && list.contains(pTFeedbackTagView.getTagName())) {
                    pTFeedbackTagView.performClick();
                }
            }
        }
    }

    public void setInteractable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d29da516afb4ca1a1a2ff3ea13ed5e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d29da516afb4ca1a1a2ff3ea13ed5e9");
        } else if (!CollectionUtils.isEmpty(this.c)) {
            for (PTFeedbackTagView pTFeedbackTagView : this.c) {
                if (pTFeedbackTagView != null) {
                    pTFeedbackTagView.setInteractable(z);
                }
            }
        }
    }

    public Set<String> getSelectedTags() {
        return this.d;
    }

    public void setVoCallback(rx.functions.c<String, Object> cVar) {
        this.e = cVar;
    }
}
