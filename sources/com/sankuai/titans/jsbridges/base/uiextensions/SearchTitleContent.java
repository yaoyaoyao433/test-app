package com.sankuai.titans.jsbridges.base.uiextensions;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.support.constraint.R;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.webcompat.elements.ITitleContent;
import com.sankuai.titans.protocol.webcompat.elements.OnTitleBarEventListener;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SearchTitleContent extends FrameLayout implements ITitleContent {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Context mContext;
    private final View searchContainer;
    private final ImageView searchIcon;
    private final TextView searchText;
    private final TextView searchTitle;

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleContent
    public ITitleContent.IImageTitleInterceptor getImageTitleInterceptor() {
        return null;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleContent
    public boolean isDetachedFromWindow() {
        return false;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleContent
    public void runOnUiThread(Runnable runnable) {
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleContent
    public void setImageTitleInterceptor(ITitleContent.IImageTitleInterceptor iImageTitleInterceptor) {
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleContent
    public void setOnTitleBarEventListener(OnTitleBarEventListener onTitleBarEventListener) {
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleContent
    public void setOnTitleClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleContent
    public boolean setTitleImage(Bitmap bitmap) {
        return false;
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleContent
    public void setTitleImageLayout(int i, int i2) {
    }

    public SearchTitleContent(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3ed278f81e3ff2fe9df0eab936f3fd6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3ed278f81e3ff2fe9df0eab936f3fd6");
            return;
        }
        this.mContext = context;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View inflate = LayoutInflater.from(context).inflate(R.layout.titans_search_layout, this);
        this.searchTitle = (TextView) inflate.findViewById(R.id.search_title);
        this.searchIcon = (ImageView) inflate.findViewById(R.id.search_icon);
        this.searchText = (TextView) inflate.findViewById(R.id.search_edit);
        this.searchContainer = inflate.findViewById(R.id.search_input);
        setSearchIcon(R.drawable.titans_search_box_icon, 0);
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleContent
    public void setTitleText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "822937c5bf7dfa8f0e4e806ed48d0dad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "822937c5bf7dfa8f0e4e806ed48d0dad");
            return;
        }
        this.searchTitle.setVisibility(0);
        this.searchTitle.setText(str);
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleContent
    public String getTitleText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9fbf06ae2ba2f7a7c10f0af2a2e567e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9fbf06ae2ba2f7a7c10f0af2a2e567e") : this.searchTitle.getText().toString();
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleContent
    public int getCalculatedWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21ba615fd2226284fab2f3815931a197", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21ba615fd2226284fab2f3815931a197")).intValue() : (int) Layout.getDesiredWidth(getTitleText(), this.searchText.getPaint());
    }

    @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleContent
    public void setTitleContentParams(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33d424896bdb4b3008ac8dd2e1372e96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33d424896bdb4b3008ac8dd2e1372e96");
        } else if (jSONObject != null) {
            int optInt = jSONObject.optInt("isShowSearch");
            String optString = jSONObject.optString("searchText");
            String optString2 = jSONObject.optString("searchTextColor");
            final String optString3 = jSONObject.optString("redirectUrl");
            String optString4 = jSONObject.optString("searchTitle");
            if (1 == optInt) {
                setVisibility(0);
                this.searchText.setText(optString);
                setSearchTextColor(optString2);
                setSearchRedirectListener(new View.OnClickListener() { // from class: com.sankuai.titans.jsbridges.base.uiextensions.SearchTitleContent.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "946611ea51031612a3fb96834ad36ff3", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "946611ea51031612a3fb96834ad36ff3");
                        } else {
                            SearchTitleContent.this.processRedirectUrl(optString3);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "483e3bb1b7ee1a925b48499a2019796d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "483e3bb1b7ee1a925b48499a2019796d");
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

    public void setSearchIcon(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0acfac30e966cd49807cd07c7ddc696b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0acfac30e966cd49807cd07c7ddc696b");
            return;
        }
        this.searchIcon.setImageResource(i);
        this.searchIcon.setVisibility(i2);
    }

    public void setSearchRedirectListener(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e47f0502f80b056af8d923a727081abc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e47f0502f80b056af8d923a727081abc");
        } else {
            this.searchContainer.setOnClickListener(onClickListener);
        }
    }

    public void processRedirectUrl(String str) {
        Uri uri;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9b786adc1cdc2d71070e52d2267a690", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9b786adc1cdc2d71070e52d2267a690");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b9c511a32a4057fcd69532a13574826", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b9c511a32a4057fcd69532a13574826");
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
        }
    }
}
