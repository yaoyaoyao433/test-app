package com.meituan.android.ptcommonim.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.ptcommonim.feedback.model.PTQuestionData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.Picasso;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTFeedbackScoreView extends FrameLayout {
    public static ChangeQuickRedirect a;
    final a b;
    private ImageView c;
    private TextView d;
    private rx.functions.d<PTFeedbackScoreView, Integer, PTQuestionData.QuestionInfo> e;

    public PTFeedbackScoreView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01890d0b92f9169e5a6ea3d30dc3155e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01890d0b92f9169e5a6ea3d30dc3155e");
            return;
        }
        this.b = new a();
        a();
    }

    public PTFeedbackScoreView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b8b18f20e1ac2cd8d445af9849acf5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b8b18f20e1ac2cd8d445af9849acf5b");
            return;
        }
        this.b = new a();
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86a659be553f2b803afc2bb1ba3405f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86a659be553f2b803afc2bb1ba3405f9");
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.ptim_feedback_score_item_layout, this);
        this.c = (ImageView) findViewById(R.id.score_image);
        this.c.setImageResource(R.drawable.ptim_round_bg_default);
        this.d = (TextView) findViewById(R.id.score_title);
        setOnClickListener(d.a(this));
    }

    public static /* synthetic */ void a(PTFeedbackScoreView pTFeedbackScoreView, View view) {
        Object[] objArr = {pTFeedbackScoreView, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b824395e93cf295318059abbc47a0de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b824395e93cf295318059abbc47a0de");
        } else if (pTFeedbackScoreView.e != null) {
            pTFeedbackScoreView.e.a(pTFeedbackScoreView, Integer.valueOf(pTFeedbackScoreView.b.b), pTFeedbackScoreView.b.i);
        }
    }

    public void setOnScoreClickListener(rx.functions.d<PTFeedbackScoreView, Integer, PTQuestionData.QuestionInfo> dVar) {
        this.e = dVar;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9ea213faa1208535e7284777ddd25a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9ea213faa1208535e7284777ddd25a3");
            return;
        }
        if (z) {
            Picasso.g(getContext()).d(this.b.e).b(this.b.c).a(this.c);
            this.d.setTextColor(getResources().getColor(R.color.black));
        } else {
            Picasso.g(getContext()).d(this.b.f).b(this.b.d).a(this.c);
            this.d.setTextColor(getResources().getColor(R.color.gray_light));
        }
        this.b.h = z;
    }

    @Override // android.view.View
    public boolean isSelected() {
        return this.b.h;
    }

    public void setTitle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03602cf02552607894991b1df657b10e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03602cf02552607894991b1df657b10e");
        } else if (str != null) {
            this.d.setText(str);
        }
    }

    public int getScore() {
        return this.b.b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        public int d;
        public String e;
        public String f;
        public String g;
        public boolean h;
        public PTQuestionData.QuestionInfo i;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f71775fb5bfcbfc08e92412cdd30eb73", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f71775fb5bfcbfc08e92412cdd30eb73");
            } else {
                this.h = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static String a(int i, boolean z) {
            Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51c5e514763cad4407e6d3d4a98ccb4f", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51c5e514763cad4407e6d3d4a98ccb4f");
            }
            if (i <= 0 || i > 5) {
                return "";
            }
            if (z) {
                return com.meituan.android.ptcommonim.pageadapter.message.utils.d.b[i - 1];
            }
            return com.meituan.android.ptcommonim.pageadapter.message.utils.d.a[i - 1];
        }
    }
}
