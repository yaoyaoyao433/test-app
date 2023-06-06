package com.sankuai.waimai.rocks.page.utils;

import android.content.Context;
import android.content.res.AssetManager;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import com.sankuai.waimai.rocks.page.model.RocksResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private final Context b;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3966f7a79e4adb5fc7be52d1c7652557", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3966f7a79e4adb5fc7be52d1c7652557");
        } else {
            this.b = context;
        }
    }

    public final RocksResponse<RocksServerModel> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "846f3b778ed2d202e068109eefb8e761", RobustBitConfig.DEFAULT_VALUE)) {
            return (RocksResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "846f3b778ed2d202e068109eefb8e761");
        }
        try {
            AssetManager assets = this.b.getAssets();
            InputStreamReader inputStreamReader = new InputStreamReader(assets.open(str + ".json"), "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    inputStreamReader.close();
                    bufferedReader.close();
                    return (RocksResponse) new Gson().fromJson(sb.toString(), new TypeToken<RocksResponse<RocksServerModel>>() { // from class: com.sankuai.waimai.rocks.page.utils.a.1
                    }.getType());
                }
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        } catch (Exception e3) {
            e3.printStackTrace();
            return null;
        }
    }
}
