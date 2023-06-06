package com.sankuai.waimai.platform.widget;

import android.content.Context;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.comment.CommentGood;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class CommentTextView extends TextView {
    public static ChangeQuickRedirect a;
    private List<CommentGood> b;
    private char c;
    private b d;
    private int e;
    private b f;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(View view, CommentGood commentGood);
    }

    public CommentTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "add66133c6e701bb4e7d48813ba5c7c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "add66133c6e701bb4e7d48813ba5c7c8");
            return;
        }
        this.b = new ArrayList();
        this.c = '#';
        this.f = new b() { // from class: com.sankuai.waimai.platform.widget.CommentTextView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.CommentTextView.b
            public final void a(View view, CommentGood commentGood) {
                Object[] objArr2 = {view, commentGood};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5857cda7b0dc1553070ccb13e8ce2227", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5857cda7b0dc1553070ccb13e8ce2227");
                } else if (CommentTextView.this.d != null) {
                    CommentTextView.this.d.a(view, commentGood);
                }
            }
        };
    }

    public CommentTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "228ea04073460349432fd7881b7184b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "228ea04073460349432fd7881b7184b0");
            return;
        }
        this.b = new ArrayList();
        this.c = '#';
        this.f = new b() { // from class: com.sankuai.waimai.platform.widget.CommentTextView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.CommentTextView.b
            public final void a(View view, CommentGood commentGood) {
                Object[] objArr2 = {view, commentGood};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5857cda7b0dc1553070ccb13e8ce2227", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5857cda7b0dc1553070ccb13e8ce2227");
                } else if (CommentTextView.this.d != null) {
                    CommentTextView.this.d.a(view, commentGood);
                }
            }
        };
    }

    public CommentTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2035bc41cb7fbaaf8b1a8308715d8934", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2035bc41cb7fbaaf8b1a8308715d8934");
            return;
        }
        this.b = new ArrayList();
        this.c = '#';
        this.f = new b() { // from class: com.sankuai.waimai.platform.widget.CommentTextView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.CommentTextView.b
            public final void a(View view, CommentGood commentGood) {
                Object[] objArr2 = {view, commentGood};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5857cda7b0dc1553070ccb13e8ce2227", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5857cda7b0dc1553070ccb13e8ce2227");
                } else if (CommentTextView.this.d != null) {
                    CommentTextView.this.d.a(view, commentGood);
                }
            }
        };
    }

    public void setCommentGoodList(List<CommentGood> list) {
        this.b = list;
    }

    public void setOnSpanTextListener(b bVar) {
        this.d = bVar;
    }

    public void setHighLightColorId(int i) {
        this.e = i;
    }

    public final void a() {
        int i;
        CommentGood a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3c2761ddcc776a71d131677a231e280", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3c2761ddcc776a71d131677a231e280");
            return;
        }
        try {
            String charSequence = getText().toString();
            SpannableString spannableString = new SpannableString(charSequence);
            int i2 = 0;
            for (int i3 = 0; i3 < charSequence.length(); i3++) {
                if (charSequence.charAt(i3) == this.c) {
                    if (i2 < 0 || i3 <= 0 || i2 >= i3 || (i = i3 + 1) > charSequence.length() || (a2 = a(charSequence.substring(i2, i))) == null) {
                        i2 = i3;
                    } else {
                        spannableString.setSpan(new a(this.f, a2, this.e), i2, i, 33);
                        i2 = i;
                    }
                }
            }
            setText(spannableString);
            setMovementMethod(LinkMovementMethod.getInstance());
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.utils.log.a.e("CommentTextView-setSpanWord", th.getMessage(), new Object[0]);
        }
    }

    private CommentGood a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "355d976c3448cd0ce3f830e4ea1ae6e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (CommentGood) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "355d976c3448cd0ce3f830e4ea1ae6e2");
        }
        try {
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.utils.log.a.e("CommentTextView-getKeyWord", th.getMessage(), new Object[0]);
        }
        if (this.b != null && !this.b.isEmpty() && str != null && str.length() != 0) {
            for (int i = 0; i < this.b.size(); i++) {
                CommentGood commentGood = this.b.get(i);
                String keyword = commentGood.getKeyword();
                if (str.equals(this.c + keyword + this.c)) {
                    return commentGood;
                }
            }
            return null;
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a extends ClickableSpan {
        public static ChangeQuickRedirect a;
        private final b c;
        private final CommentGood d;
        private int e;

        public a(b bVar, CommentGood commentGood, int i) {
            Object[] objArr = {CommentTextView.this, bVar, commentGood, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4849a7a66458ffc6b31874d3127404c3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4849a7a66458ffc6b31874d3127404c3");
                return;
            }
            this.c = bVar;
            this.d = commentGood;
            this.e = i;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            Object[] objArr = {textPaint};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2216d90c39f16642f07edc00173f6ce0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2216d90c39f16642f07edc00173f6ce0");
                return;
            }
            textPaint.setColor(CommentTextView.this.getResources().getColor(this.e == 0 ? R.color.takeout_blue_5 : this.e));
            textPaint.setUnderlineText(false);
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afdced64dbb3afac729d5de7aa4bdea7", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afdced64dbb3afac729d5de7aa4bdea7");
            } else if (this.c != null) {
                this.c.a(view, this.d);
            }
        }
    }
}
