package com.sankuai.waimai.business.restaurant.poicontainer.views;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.meituan.mtimageloader.loader.a;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.platform.widget.AbsTabLayout;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ShopTabLayoutNew extends AbsTabLayout {
    public static ChangeQuickRedirect a;

    public ShopTabLayoutNew(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6804831e920fd5d3fd8ccbf3f7803509", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6804831e920fd5d3fd8ccbf3f7803509");
        }
    }

    public ShopTabLayoutNew(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8bad9a001d2dbef95a24137cf6d235a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8bad9a001d2dbef95a24137cf6d235a");
        }
    }

    public ShopTabLayoutNew(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4f16cd7589e5acb2f1c5386d8b6c15d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4f16cd7589e5acb2f1c5386d8b6c15d");
        }
    }

    @Override // com.sankuai.waimai.platform.widget.AbsTabLayout
    public final View a(CharSequence charSequence, LayoutInflater layoutInflater, int i) {
        Object[] objArr = {charSequence, layoutInflater, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86e4fd9b0918d4848845fb27de5f82f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86e4fd9b0918d4848845fb27de5f82f7");
        }
        ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(R.layout.wm_restaurant_tab_layout_item_new, (ViewGroup) this, false);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.width = i;
        viewGroup.setLayoutParams(layoutParams);
        viewGroup.requestLayout();
        TextView textView = (TextView) viewGroup.findViewById(R.id.takeout_txt_tab);
        textView.setText(charSequence);
        textView.setContentDescription(((Object) charSequence) + "，未选中");
        return viewGroup;
    }

    public final void a(int i, String str) {
        View childAt;
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfbfa1d174418ccbea6526dcb20b2b35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfbfa1d174418ccbea6526dcb20b2b35");
        } else if (TextUtils.isEmpty(str) || this.e.getChildAt(i) == null || (childAt = this.e.getChildAt(i)) == null) {
        } else {
            ImageView imageView = (ImageView) childAt.findViewById(R.id.takeout_img_tab_right);
            imageView.setVisibility(0);
            b.C0608b c = a.c();
            c.b = getContext();
            c.e = 1;
            c.c = str;
            c.i = R.drawable.wm_restaurant_tab_icon_new;
            c.a(imageView);
        }
    }

    public final void a(int i) {
        ImageView imageView;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb2b844e5c9114a1e01d25ab36f79164", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb2b844e5c9114a1e01d25ab36f79164");
            return;
        }
        View childAt = this.e.getChildAt(i);
        if (childAt == null || (imageView = (ImageView) childAt.findViewById(R.id.takeout_img_tab_right)) == null || imageView.getVisibility() == 8) {
            return;
        }
        imageView.setVisibility(8);
    }

    @Override // com.sankuai.waimai.platform.widget.AbsTabLayout
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d71bcc725cc829968e408dc551d3c6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d71bcc725cc829968e408dc551d3c6a");
            return;
        }
        TextView textView = (TextView) view.findViewById(R.id.takeout_txt_tab);
        textView.setContentDescription(((Object) textView.getText()) + "，已选中");
        textView.setTextColor(this.h.getResources().getColor(R.color.wm_restaurant_222426));
        textView.setTypeface(Typeface.defaultFromStyle(1));
    }

    @Override // com.sankuai.waimai.platform.widget.AbsTabLayout
    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84ce260cd56c6fb9786178f818030431", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84ce260cd56c6fb9786178f818030431");
            return;
        }
        TextView textView = (TextView) view.findViewById(R.id.takeout_txt_tab);
        textView.setContentDescription(((Object) textView.getText()) + "，未选中");
        textView.setTextColor(this.h.getResources().getColor(R.color.wm_restaurant_858687));
        textView.setTypeface(Typeface.defaultFromStyle(0));
    }

    public void setCommentNum(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2f8f405a4aec002f588580a28f9e76c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2f8f405a4aec002f588580a28f9e76c");
        } else {
            a(str, 1);
        }
    }

    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "205057178517d56acff2b5ab9f86bf3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "205057178517d56acff2b5ab9f86bf3c");
            return;
        }
        View childAt = this.e.getChildAt(i);
        if (childAt != null) {
            TextView textView = (TextView) childAt.findViewById(R.id.txt_comment_num);
            textView.setContentDescription(str + "条");
            ah.a(textView, str);
        }
    }

    public void setTabBackToTopIconVisible(int i) {
        View childAt;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fbba8286bc28b34776bc6b3c57b347e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fbba8286bc28b34776bc6b3c57b347e");
        } else if (this.e.getChildAt(i) == null || (childAt = this.e.getChildAt(i)) == null) {
        } else {
            ImageView imageView = (ImageView) childAt.findViewById(R.id.iv_back_to_top);
            imageView.setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
            alphaAnimation.setDuration(300L);
            imageView.setAnimation(alphaAnimation);
        }
    }

    public void setTabBackToTopIconGone(int i) {
        View childAt;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42e76912db82b820f6d076774d00d257", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42e76912db82b820f6d076774d00d257");
        } else if (this.e.getChildAt(i) == null || (childAt = this.e.getChildAt(i)) == null) {
        } else {
            ((ImageView) childAt.findViewById(R.id.iv_back_to_top)).setVisibility(8);
        }
    }
}
