package com.dianping.shield.component.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.agentsdk.framework.aq;
import com.dianping.portal.feature.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ScTitleBar extends LinearLayout implements i {
    private static final int ALPHA_MAX = 255;
    private static final int TITLE_BAR_ALPHA_THRESHOLD = 80;
    private static final int TITLE_BAR_UI_APPEARANCE_THRESHOLD = 40;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int mAlphaThreshold;
    private Context mContext;
    private int mCurrentAlpha;
    private ViewGroup mCustomTitleViewContainer;
    private boolean mIsCustomTitleView;
    private boolean mIsTransparent;
    private ImageButton mLeftView;
    private ViewGroup mLeftViewContainer;
    private ViewGroup mRightViewContainer;
    private TextView mSubTitleView;
    private View mTitleBar;
    private TextView mTitleView;
    private ViewGroup mTitleViewContainer;
    private int mUIAppearanceThreshold;
    private ArrayList<ScTitleBarTransparentListener> transparentListenerList;

    public ScTitleBar(Context context) {
        this(context, null, 0);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc67671d47424be229c5182a7cd0413f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc67671d47424be229c5182a7cd0413f");
        }
    }

    public ScTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4788a352aa9a5ad5dd1a0be7dccd7a90", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4788a352aa9a5ad5dd1a0be7dccd7a90");
        }
    }

    public ScTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "457ed5f421d7873fe1856158ac77d116", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "457ed5f421d7873fe1856158ac77d116");
            return;
        }
        this.mContext = context;
        init();
    }

    private void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a0f5911eacbe6be904d1be0704a1d53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a0f5911eacbe6be904d1be0704a1d53");
            return;
        }
        this.mIsTransparent = false;
        this.mCurrentAlpha = 255;
        this.mAlphaThreshold = aq.a(this.mContext, 80.0f);
        this.mUIAppearanceThreshold = aq.a(this.mContext, 40.0f);
        this.mIsCustomTitleView = false;
        setId(R.id.shieldc_title_bar_container);
        LayoutInflater.from(this.mContext).inflate(R.layout.shieldc_title_bar_layout, this);
        this.mTitleBar = findViewById(R.id.shieldc_title_bar);
        this.mLeftViewContainer = (ViewGroup) this.mTitleBar.findViewById(R.id.shieldc_title_bar_left_view_container);
        this.mLeftView = (ImageButton) this.mLeftViewContainer.findViewById(R.id.shieldc_left_title_button);
        this.mTitleViewContainer = (ViewGroup) this.mTitleBar.findViewById(R.id.shieldc_title_bar_content_container);
        this.mTitleView = (TextView) this.mTitleViewContainer.findViewById(R.id.shieldc_title_bar_title);
        this.mSubTitleView = (TextView) this.mTitleViewContainer.findViewById(R.id.shieldc_title_bar_subtitle);
        this.mRightViewContainer = (ViewGroup) this.mTitleBar.findViewById(R.id.shieldc_title_bar_right_view_container);
        this.mCustomTitleViewContainer = (ViewGroup) this.mTitleBar.findViewById(R.id.shieldc_title_bar_custom_title_container);
    }

    public void setTransparent(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c973935ccc0996142cec341e50795435", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c973935ccc0996142cec341e50795435");
        } else if (this.mIsTransparent != z) {
            this.mIsTransparent = z;
            updateTitleBarUI(0);
            if (this.transparentListenerList == null || this.transparentListenerList.isEmpty()) {
                return;
            }
            Iterator<ScTitleBarTransparentListener> it = this.transparentListenerList.iterator();
            while (it.hasNext()) {
                it.next().onScTitleBarTransparentChanged(this.mIsTransparent);
            }
        }
    }

    public void setAlphaThreshold(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87c74e34e7346d3c0d245d785d1020c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87c74e34e7346d3c0d245d785d1020c4");
        } else {
            this.mAlphaThreshold = aq.a(this.mContext, i);
        }
    }

    public void setScrollY(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c490b9b31bdb028c26cf76e33732b62c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c490b9b31bdb028c26cf76e33732b62c");
        } else {
            updateTitleBarUI(i);
        }
    }

    public void setFirstItemScrollY(int i, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f13d55f42cdae8c78a79434919d29f73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f13d55f42cdae8c78a79434919d29f73");
            return;
        }
        if (!z) {
            i = this.mAlphaThreshold;
        }
        updateTitleBarUI(i);
    }

    private void updateTitleBarUI(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59577f7ce7ac60ea76dbb2a73372dcc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59577f7ce7ac60ea76dbb2a73372dcc4");
        } else if (this.mIsTransparent) {
            if (i < 0) {
                i = 0;
            }
            updateTitleBarStyle(i);
            updateTitleStyle(i);
        }
    }

    private void updateTitleBarStyle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "945c2047cae431e2dce08dd82b94f018", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "945c2047cae431e2dce08dd82b94f018");
        } else {
            setTitlebarBackgroundAlpha(Math.min(255, (int) ((i / this.mAlphaThreshold) * 255.0f)));
        }
    }

    private void updateTitleStyle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5c050de4ad13d4e8ffc5a8d9064bdd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5c050de4ad13d4e8ffc5a8d9064bdd9");
        } else if (this.mTitleView == null || this.mSubTitleView == null) {
        } else {
            if (i < this.mUIAppearanceThreshold) {
                this.mLeftView.setImageResource(R.drawable.shieldc_title_bar_back_light);
                if (!this.mIsCustomTitleView) {
                    this.mTitleViewContainer.setVisibility(4);
                }
                this.mRightViewContainer.setVisibility(4);
                return;
            }
            this.mLeftView.setImageResource(R.drawable.shieldc_title_bar_back_dark);
            if (!this.mIsCustomTitleView) {
                this.mTitleViewContainer.setVisibility(0);
            }
            this.mRightViewContainer.setVisibility(0);
        }
    }

    @Override // com.dianping.portal.feature.i
    public void setBarTitle(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "986541358c56db401ffbd9b81bd38e60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "986541358c56db401ffbd9b81bd38e60");
        } else if (this.mTitleView != null) {
            this.mTitleView.setText(charSequence);
        }
    }

    @Override // com.dianping.portal.feature.i
    public void setBarSubtitle(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a0604d0d4fd264cdbe09d0cd1e82b57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a0604d0d4fd264cdbe09d0cd1e82b57");
            return;
        }
        if (this.mSubTitleView != null) {
            this.mSubTitleView.setVisibility(0);
            this.mSubTitleView.setText(charSequence);
        }
        if (this.mTitleView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mTitleView.getLayoutParams();
            layoutParams.gravity = 49;
            this.mTitleView.setLayoutParams(layoutParams);
        }
    }

    @Override // com.dianping.portal.feature.i
    public void setTitlebarBackground(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df5468831dbff7b711cc5481de1734b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df5468831dbff7b711cc5481de1734b8");
        } else if (this.mTitleBar != null) {
            this.mTitleBar.setBackground(drawable);
            if (this.mIsTransparent) {
                this.mTitleBar.getBackground().setAlpha(this.mCurrentAlpha);
            }
        }
    }

    public void setTitlebarBackgroundAlpha(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c31f6bd4df996c8c49b8400f37783040", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c31f6bd4df996c8c49b8400f37783040");
        } else if (this.mTitleBar == null || this.mTitleBar.getBackground() == null) {
        } else {
            this.mTitleBar.getBackground().setAlpha(i);
            if (this.mIsTransparent) {
                this.mCurrentAlpha = i;
            }
        }
    }

    @Override // com.dianping.portal.feature.i
    public void showTitlebar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4e16aae70b3b164f2400ac707a8819b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4e16aae70b3b164f2400ac707a8819b");
        } else if (this.mTitleBar != null) {
            this.mTitleBar.setVisibility(0);
        }
    }

    @Override // com.dianping.portal.feature.i
    public void hideTitlebar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3533f073dd0608b5d6a25b5c81e1ddd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3533f073dd0608b5d6a25b5c81e1ddd8");
        } else if (this.mTitleBar != null) {
            this.mTitleBar.setVisibility(8);
        }
    }

    public boolean isHidden() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6759572cc09d124041d75540aab355c9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6759572cc09d124041d75540aab355c9")).booleanValue() : this.mTitleBar != null && this.mTitleBar.getVisibility() == 8;
    }

    public void removeLeftViewItem(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92cdbb9a15cce16e1e62142bea759c2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92cdbb9a15cce16e1e62142bea759c2e");
            return;
        }
        View findLeftViewItemByTag = findLeftViewItemByTag(str);
        if (findLeftViewItemByTag == null || this.mLeftViewContainer == null) {
            return;
        }
        this.mLeftViewContainer.removeView(findLeftViewItemByTag);
    }

    public void addLeftView(View view, String str, View.OnClickListener onClickListener) {
        int i = 0;
        Object[] objArr = {view, str, onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24ead1a0561ee3854e7ab86ec2720800", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24ead1a0561ee3854e7ab86ec2720800");
        } else if (view == null || this.mLeftViewContainer == null) {
        } else {
            view.setOnClickListener(onClickListener);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new LinearLayout.LayoutParams(-2, -2);
            }
            view.setLayoutParams(layoutParams);
            if (TextUtils.isEmpty(str)) {
                this.mLeftViewContainer.addView(view, this.mLeftViewContainer.getChildCount());
                return;
            }
            view.setTag(R.id.shieldc_title_bar_left_item_tag, str);
            View findLeftViewItemByTag = findLeftViewItemByTag(str);
            if (findLeftViewItemByTag == null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= this.mLeftViewContainer.getChildCount()) {
                        break;
                    }
                    Object tag = this.mLeftViewContainer.getChildAt(i2).getTag(R.id.shieldc_title_bar_left_item_tag);
                    if ((tag instanceof String) && str.compareTo((String) tag) > 0) {
                        i = i2 + 1;
                        break;
                    }
                    i2++;
                }
            } else {
                i = this.mLeftViewContainer.indexOfChild(findLeftViewItemByTag);
                this.mLeftViewContainer.removeView(findLeftViewItemByTag);
            }
            this.mLeftViewContainer.addView(view, i);
        }
    }

    public View findLeftViewItemByTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17abeb9e06b053cc70fed802ab53ec02", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17abeb9e06b053cc70fed802ab53ec02");
        }
        if (TextUtils.isEmpty(str) || this.mLeftViewContainer == null) {
            return null;
        }
        for (int i = 0; i < this.mLeftViewContainer.getChildCount(); i++) {
            View childAt = this.mLeftViewContainer.getChildAt(i);
            if (str.equals(childAt.getTag(R.id.shieldc_title_bar_left_item_tag))) {
                return childAt;
            }
        }
        return null;
    }

    public void setDefaultLeftViewAction(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dcb10b61deffbde77d99b32b61fc71b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dcb10b61deffbde77d99b32b61fc71b6");
        } else if (this.mLeftView == null) {
        } else {
            this.mLeftView.setOnClickListener(onClickListener);
        }
    }

    public void setDefaultLeftView(@DrawableRes int i, View.OnClickListener onClickListener) {
        Object[] objArr = {Integer.valueOf(i), onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "871e8cf7f7bb3205b3dabc639e242007", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "871e8cf7f7bb3205b3dabc639e242007");
        } else if (this.mLeftView == null) {
        } else {
            this.mLeftView.setImageResource(i);
            this.mLeftView.setOnClickListener(onClickListener);
        }
    }

    public void setLeftViewAsDefault() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "322b5f0d4557ffbe4fcd2ce9fb641143", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "322b5f0d4557ffbe4fcd2ce9fb641143");
        } else if (this.mLeftView == null) {
        } else {
            this.mLeftViewContainer.removeAllViews();
            this.mLeftViewContainer.addView(this.mLeftView);
            this.mLeftView.setImageResource(R.drawable.shieldc_title_bar_back_dark);
        }
    }

    public void removeAllLeftViews() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ad55f20caff1e9b67d9dd8df1645602", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ad55f20caff1e9b67d9dd8df1645602");
        } else {
            this.mLeftViewContainer.removeAllViews();
        }
    }

    @Override // com.dianping.portal.feature.i
    public void addRightViewItem(View view, String str, View.OnClickListener onClickListener) {
        int i = 0;
        Object[] objArr = {view, str, onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1ffe2414d1540ebf76586b66b231a1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1ffe2414d1540ebf76586b66b231a1a");
        } else if (view == null || this.mRightViewContainer == null) {
        } else {
            view.setOnClickListener(onClickListener);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new LinearLayout.LayoutParams(-2, -2);
            }
            layoutParams.setMargins(aq.a(this.mContext, 10.0f), 0, aq.a(this.mContext, 10.0f), 0);
            view.setLayoutParams(layoutParams);
            if (TextUtils.isEmpty(str)) {
                this.mRightViewContainer.addView(view, this.mRightViewContainer.getChildCount());
                return;
            }
            view.setTag(R.id.shieldc_title_bar_right_item_tag, str);
            View findRightViewItemByTag = findRightViewItemByTag(str);
            if (findRightViewItemByTag == null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= this.mRightViewContainer.getChildCount()) {
                        break;
                    }
                    Object tag = this.mRightViewContainer.getChildAt(i2).getTag(R.id.shieldc_title_bar_right_item_tag);
                    if ((tag instanceof String) && str.compareTo((String) tag) > 0) {
                        i = i2 + 1;
                        break;
                    }
                    i2++;
                }
            } else {
                i = this.mRightViewContainer.indexOfChild(findRightViewItemByTag);
                this.mRightViewContainer.removeView(findRightViewItemByTag);
            }
            this.mRightViewContainer.addView(view, i);
        }
    }

    @Override // com.dianping.portal.feature.i
    public void removeRightViewItem(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82bfe992aab8ab27f290f855ab6ff4cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82bfe992aab8ab27f290f855ab6ff4cd");
            return;
        }
        View findRightViewItemByTag = findRightViewItemByTag(str);
        if (findRightViewItemByTag == null || this.mRightViewContainer == null) {
            return;
        }
        this.mRightViewContainer.removeView(findRightViewItemByTag);
    }

    @Override // com.dianping.portal.feature.i
    public void removeAllRightViewItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29e4da4a2ea3828925d53943be319c17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29e4da4a2ea3828925d53943be319c17");
        } else if (this.mRightViewContainer != null) {
            this.mRightViewContainer.removeAllViews();
        }
    }

    @Override // com.dianping.portal.feature.i
    public View findRightViewItemByTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74b6923d2acc21e177e628b45b16d01a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74b6923d2acc21e177e628b45b16d01a");
        }
        if (TextUtils.isEmpty(str) || this.mRightViewContainer == null) {
            return null;
        }
        for (int i = 0; i < this.mRightViewContainer.getChildCount(); i++) {
            View childAt = this.mRightViewContainer.getChildAt(i);
            if (str.equals(childAt.getTag(R.id.shieldc_title_bar_right_item_tag))) {
                return childAt;
            }
        }
        return null;
    }

    @Override // com.dianping.portal.feature.i
    public void setTitleCustomView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "426f9f630fc7a35061e318528e7cbaae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "426f9f630fc7a35061e318528e7cbaae");
        } else {
            setTitleCustomView(view, false, false);
        }
    }

    @Override // com.dianping.portal.feature.i
    public void setTitleCustomView(View view, boolean z, boolean z2) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f49954e9592cda58de8ad80cbe327950", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f49954e9592cda58de8ad80cbe327950");
            return;
        }
        setShowLeftButton(z);
        setShowRightButton(z2);
        if (view == null || this.mCustomTitleViewContainer == null) {
            return;
        }
        this.mCustomTitleViewContainer.removeAllViews();
        this.mCustomTitleViewContainer.addView(view, new FrameLayout.LayoutParams(-1, -1));
        this.mCustomTitleViewContainer.setVisibility(0);
        this.mTitleViewContainer.setVisibility(8);
        this.mIsCustomTitleView = true;
    }

    public void removeCustomTitleViews() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65970dd6415c6a0e77a82a30da0aaa36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65970dd6415c6a0e77a82a30da0aaa36");
            return;
        }
        this.mCustomTitleViewContainer.removeAllViews();
        this.mTitleViewContainer.setVisibility(0);
    }

    @Override // com.dianping.portal.feature.i
    public void setShowLeftButton(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63994138febca0dda0c290f8fa588372", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63994138febca0dda0c290f8fa588372");
        } else {
            this.mLeftViewContainer.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.dianping.portal.feature.i
    public void setShowRightButton(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a78225015987e7cda209a4611225a1b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a78225015987e7cda209a4611225a1b9");
        } else {
            this.mRightViewContainer.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e31ae585e5a7568ef37e2340e5691ce8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e31ae585e5a7568ef37e2340e5691ce8");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        updateTitleContainerPadding();
    }

    private void updateTitleContainerPadding() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b685256c107788495718dd3bbe623fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b685256c107788495718dd3bbe623fe");
            return;
        }
        int max = Math.max(this.mLeftViewContainer.isShown() ? this.mLeftViewContainer.getRight() : 0, this.mRightViewContainer.isShown() ? getWidth() - this.mRightViewContainer.getLeft() : 0);
        this.mTitleViewContainer.setPadding(max, 0, max, 0);
        this.mCustomTitleViewContainer.setPadding(max, 0, max, 0);
    }

    public boolean isScTitleBarTransparent() {
        return this.mIsTransparent;
    }

    public void addScTitleBarTransparentListener(ScTitleBarTransparentListener scTitleBarTransparentListener) {
        Object[] objArr = {scTitleBarTransparentListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce14d7c21ba9288f0112bd0d0b59dfe3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce14d7c21ba9288f0112bd0d0b59dfe3");
        } else if (scTitleBarTransparentListener == null) {
        } else {
            if (this.transparentListenerList == null) {
                this.transparentListenerList = new ArrayList<>();
            }
            if (this.transparentListenerList.contains(scTitleBarTransparentListener)) {
                return;
            }
            this.transparentListenerList.add(scTitleBarTransparentListener);
        }
    }

    public void removeScTitleBarTransparentListener(ScTitleBarTransparentListener scTitleBarTransparentListener) {
        Object[] objArr = {scTitleBarTransparentListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "204d3fcb0db54e775e4a31111b4692cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "204d3fcb0db54e775e4a31111b4692cb");
        } else if (scTitleBarTransparentListener == null || this.transparentListenerList == null || !this.transparentListenerList.contains(scTitleBarTransparentListener)) {
        } else {
            this.transparentListenerList.remove(scTitleBarTransparentListener);
        }
    }
}
