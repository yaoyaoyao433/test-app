package com.dianping.titans.widget;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.constraint.R;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.dianping.titans.widget.BaseTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.util.UIUtil;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SearchTitleBar extends BaseTitleBar {
    public static ChangeQuickRedirect changeQuickRedirect;
    private SearchTitle searchTitle;

    public SearchTitleBar(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3240f6757182d577e09f4e59c58d6a45", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3240f6757182d577e09f4e59c58d6a45");
        }
    }

    public SearchTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c48ea5c93a82f76e7f67015032be2c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c48ea5c93a82f76e7f67015032be2c2");
        }
    }

    @Override // com.dianping.titans.widget.BaseTitleBar
    public BaseTitleBar.ITitleContent createTitleContentView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92e39c4baf212106f4209f7ddc330d1d", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseTitleBar.ITitleContent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92e39c4baf212106f4209f7ddc330d1d");
        }
        this.searchTitle = new SearchTitle(getContext());
        return this.searchTitle;
    }

    public void setSearchIcon(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72bb56f8d36ea2618a526ead13364585", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72bb56f8d36ea2618a526ead13364585");
        } else if (this.searchTitle != null) {
            setSearchIconVisibility(0);
            this.searchTitle.setSearchIcon(i);
        }
    }

    public void setSearchIconVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0780b307ca4dd8de4312e9cee2e30791", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0780b307ca4dd8de4312e9cee2e30791");
        } else if (this.searchTitle != null) {
            this.searchTitle.setIconVisibility(i);
        }
    }

    public void setSearchListener(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ed7f74f14be4faf66c35906be3a37b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ed7f74f14be4faf66c35906be3a37b5");
        } else if (this.searchTitle != null) {
            this.searchTitle.setSearchRedirectListener(onClickListener);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80fda3fb3155414ad67d2b76b016fd1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80fda3fb3155414ad67d2b76b016fd1d");
        } else if (this.searchTitle != null) {
            this.searchTitle.setVisibility(i);
        }
    }

    public void setTitleBarVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52c10ca7332d5d140d41eb80b529be8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52c10ca7332d5d140d41eb80b529be8d");
        } else {
            super.setVisibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class SearchTitle extends FrameLayout implements BaseTitleBar.ITitleContent {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final Context mContext;
        private View rootView;
        private View searchContianer;
        private final ImageView searchIcon;
        private final TextView searchText;
        private final TextView searchTitle;

        public SearchTitle(Context context) {
            super(context);
            Object[] objArr = {SearchTitleBar.this, context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9cc213ad0e52a165510a5ba16a49e55c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9cc213ad0e52a165510a5ba16a49e55c");
                return;
            }
            this.mContext = context;
            setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            this.rootView = LayoutInflater.from(context).inflate(R.layout.knb_search_layout, this);
            this.searchTitle = (TextView) this.rootView.findViewById(R.id.search_title);
            this.searchIcon = (ImageView) this.rootView.findViewById(R.id.search_icon);
            this.searchText = (TextView) this.rootView.findViewById(R.id.search_edit);
            this.searchContianer = this.rootView.findViewById(R.id.search_input);
        }

        @Override // com.dianping.titans.widget.BaseTitleBar.ITitleContent
        public void setTitleText(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4cd9eb58898405a5e31936f20e36580d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4cd9eb58898405a5e31936f20e36580d");
                return;
            }
            this.searchTitle.setVisibility(0);
            this.searchTitle.setText(str);
        }

        @Override // com.dianping.titans.widget.BaseTitleBar.ITitleContent
        public String getTitleText() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46469ecf95f49cc495b5c42be04123f9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46469ecf95f49cc495b5c42be04123f9") : this.searchTitle.getText().toString();
        }

        public void setSearchText(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f1c08bdfc269c885a3810f4f7629b8c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f1c08bdfc269c885a3810f4f7629b8c");
            } else {
                this.searchText.setText(str);
            }
        }

        public String getSearchText() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d86011aa533ee6c247b825f11758f0be", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d86011aa533ee6c247b825f11758f0be") : this.searchText.getText().toString();
        }

        @Override // com.dianping.titans.widget.BaseTitleBar.ITitleContent
        public int getCalculatedWidth() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e4494067e005379a409f7c018700b93", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e4494067e005379a409f7c018700b93")).intValue() : (int) Layout.getDesiredWidth(getTitleText().toString(), this.searchText.getPaint());
        }

        @Override // com.dianping.titans.widget.BaseTitleBar.ITitleContent
        public void setTitleContentParams(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88e2f118cb0cedea80a997752357e130", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88e2f118cb0cedea80a997752357e130");
            } else if (jSONObject != null) {
                int optInt = jSONObject.optInt("isShowSearch");
                String optString = jSONObject.optString("searchText");
                String optString2 = jSONObject.optString("searchTextColor");
                final String optString3 = jSONObject.optString("redirectUrl");
                String optString4 = jSONObject.optString("searchTitle");
                if (1 == optInt) {
                    setVisibility(0);
                    setSearchText(optString);
                    setSearchTextColor(optString2);
                    setSearchRedirectListener(new View.OnClickListener() { // from class: com.dianping.titans.widget.SearchTitleBar.SearchTitle.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "90bcc15e8fbddb171205feb2aed2fd31", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "90bcc15e8fbddb171205feb2aed2fd31");
                            } else {
                                SearchTitle.this.processRedirectUrl(optString3);
                            }
                        }
                    });
                    if (TextUtils.isEmpty(optString4)) {
                        return;
                    }
                    setTitleText(optString4);
                    return;
                }
                setVisibility(8);
            }
        }

        private void setSearchTextColor(String str) {
            int i;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b70a975b8ca8a04293b43aaf50a81147", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b70a975b8ca8a04293b43aaf50a81147");
            } else if (TextUtils.isEmpty(str) || str.charAt(0) != '#') {
            } else {
                try {
                    i = Color.parseColor(str);
                } catch (Exception unused) {
                    i = -1;
                }
                if (i != -1) {
                    this.searchText.setTextColor(i);
                }
            }
        }

        public void setSearchIcon(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "364dcd8032fddef387edd9f3f7ab28c6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "364dcd8032fddef387edd9f3f7ab28c6");
            } else {
                this.searchIcon.setImageResource(i);
            }
        }

        public void setSearchRedirectListener(View.OnClickListener onClickListener) {
            Object[] objArr = {onClickListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c52ef96ce54aed43b042c354af6bca4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c52ef96ce54aed43b042c354af6bca4");
            } else {
                this.searchContianer.setOnClickListener(onClickListener);
            }
        }

        public void setIconVisibility(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1921abd5da2625675fa75a0f193c8785", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1921abd5da2625675fa75a0f193c8785");
            } else {
                this.searchIcon.setVisibility(i);
            }
        }

        public void processRedirectUrl(String str) {
            Uri uri;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95b60624e1b536ae79bc9f4008d362bc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95b60624e1b536ae79bc9f4008d362bc");
            } else if (!TextUtils.isEmpty(str)) {
                try {
                    uri = Uri.parse(str);
                } catch (Exception unused) {
                    uri = null;
                }
                if (uri != null && !TextUtils.isEmpty(uri.getScheme()) && !TextUtils.isEmpty(uri.getAuthority())) {
                    try {
                        this.mContext.startActivity(new Intent("android.intent.action.VIEW", uri));
                        return;
                    } catch (Exception unused2) {
                    }
                }
                startDefaultSearchActivity();
            } else {
                startDefaultSearchActivity();
            }
        }

        public void startDefaultSearchActivity() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d43ffcb203fa676c0b16b4891778d1c8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d43ffcb203fa676c0b16b4891778d1c8");
                return;
            }
            Uri.Builder builder = new Uri.Builder();
            builder.scheme("imeituan");
            builder.authority("www.meituan.com");
            builder.appendEncodedPath("search");
            Intent intent = new Intent();
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setAction("android.intent.action.VIEW");
            intent.setData(builder.build());
            try {
                this.mContext.startActivity(intent);
            } catch (Exception unused) {
                UIUtil.showShortToast(this, getContext().getString(R.string.knb_not_install_meituan));
            }
        }
    }
}
