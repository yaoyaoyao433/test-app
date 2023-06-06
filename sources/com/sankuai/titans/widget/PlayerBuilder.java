package com.sankuai.titans.widget;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.widget.media.MediaActivity;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PlayerBuilder {
    public static final String KEY_ASSETS = "ASSETS";
    public static final String KEY_ASSETS_COLOR = "ASSETS_COLOR";
    public static final String KEY_AUTO_PLAY = "AUTOPLAY";
    public static final String KEY_AUTO_SOUND = "AUTOSOUND";
    public static final String KEY_EXTRA_DATA = "EXTRA_DATA";
    public static final String KEY_FIRST_ASSET_INDEX = "FIRST_ASSET_INDEX";
    public static final String KEY_HEADERS = "HEADERS";
    public static final String KEY_HINT_CONTENT = "HINT_CONTENT";
    public static final String KEY_ONLY_VIDEO = "ONLY_VIDEO";
    public static final String KEY_SHOW_ANIMATE = "SHOW_EXIT_ANIMATE";
    public static final String KEY_SHOW_DOWNLOAD = "SHOW_DOWNLOAD";
    public static final String KEY_SHOW_INDICATE = "SHOW_INDICATE";
    public static final String KEY_SHOW_VIDEO = "SHOW_VIDEO";
    public static ChangeQuickRedirect changeQuickRedirect;
    public Bundle bundle;

    public PlayerBuilder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57d775401b9624e5028fff5d8fee19df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57d775401b9624e5028fff5d8fee19df");
        } else {
            this.bundle = new Bundle();
        }
    }

    public PlayerBuilder showDownload(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38a2da9adaf6640f2f39c0e4ac3d7c73", RobustBitConfig.DEFAULT_VALUE)) {
            return (PlayerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38a2da9adaf6640f2f39c0e4ac3d7c73");
        }
        this.bundle.putBoolean(KEY_SHOW_DOWNLOAD, z);
        return this;
    }

    public PlayerBuilder assets(ArrayList<String> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9150020837c82105291cd5d4888d38f", RobustBitConfig.DEFAULT_VALUE)) {
            return (PlayerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9150020837c82105291cd5d4888d38f");
        }
        this.bundle.putStringArrayList(KEY_ASSETS, arrayList);
        return this;
    }

    public PlayerBuilder assetsColor(ArrayList<Integer> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f70918b4ebd363024d2fe9fe8ee0db6", RobustBitConfig.DEFAULT_VALUE)) {
            return (PlayerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f70918b4ebd363024d2fe9fe8ee0db6");
        }
        this.bundle.putIntegerArrayList(KEY_ASSETS_COLOR, arrayList);
        return this;
    }

    public PlayerBuilder firstAssetIndex(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a329d98182d1fb560889690ae6aaa05", RobustBitConfig.DEFAULT_VALUE)) {
            return (PlayerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a329d98182d1fb560889690ae6aaa05");
        }
        this.bundle.putInt(KEY_FIRST_ASSET_INDEX, i);
        return this;
    }

    public PlayerBuilder showVideo(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96924ab8399cdc294fba64aee8ef451f", RobustBitConfig.DEFAULT_VALUE)) {
            return (PlayerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96924ab8399cdc294fba64aee8ef451f");
        }
        this.bundle.putBoolean(KEY_SHOW_VIDEO, z);
        return this;
    }

    public PlayerBuilder autoPlay(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "706af317b626bbcabbd23b89e2d5208b", RobustBitConfig.DEFAULT_VALUE)) {
            return (PlayerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "706af317b626bbcabbd23b89e2d5208b");
        }
        this.bundle.putBoolean(KEY_AUTO_PLAY, z);
        return this;
    }

    public PlayerBuilder autoSound(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b77e5a47a7fe3ffa6c36c5dcce9bbafb", RobustBitConfig.DEFAULT_VALUE)) {
            return (PlayerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b77e5a47a7fe3ffa6c36c5dcce9bbafb");
        }
        this.bundle.putBoolean(KEY_AUTO_SOUND, z);
        return this;
    }

    public PlayerBuilder showIndicate(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4fa03e16974caad624665e6dc50b557c", RobustBitConfig.DEFAULT_VALUE)) {
            return (PlayerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4fa03e16974caad624665e6dc50b557c");
        }
        this.bundle.putBoolean(KEY_SHOW_INDICATE, z);
        return this;
    }

    public PlayerBuilder showExitAnimate(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7144d43d9ee55e1efec9f665918d3e6e", RobustBitConfig.DEFAULT_VALUE)) {
            return (PlayerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7144d43d9ee55e1efec9f665918d3e6e");
        }
        this.bundle.putBoolean(KEY_SHOW_ANIMATE, z);
        return this;
    }

    public PlayerBuilder onlyVideo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c0f7da43f32e407c6790906af542555", RobustBitConfig.DEFAULT_VALUE)) {
            return (PlayerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c0f7da43f32e407c6790906af542555");
        }
        this.bundle.putBoolean(KEY_ONLY_VIDEO, true);
        return this;
    }

    public PlayerBuilder hintContent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "135df35525c72bd596523c5d2f256094", RobustBitConfig.DEFAULT_VALUE)) {
            return (PlayerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "135df35525c72bd596523c5d2f256094");
        }
        this.bundle.putString(KEY_HINT_CONTENT, str);
        return this;
    }

    public PlayerBuilder headers(ArrayList<HashMap<String, String>> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "211ad4f7a56a0f21f4ef14d6c81f932b", RobustBitConfig.DEFAULT_VALUE)) {
            return (PlayerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "211ad4f7a56a0f21f4ef14d6c81f932b");
        }
        this.bundle.putSerializable(KEY_HEADERS, arrayList);
        return this;
    }

    public PlayerBuilder extraData(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a56bd7233aa158d9645b53220da029b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (PlayerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a56bd7233aa158d9645b53220da029b9");
        }
        if (jSONObject != null) {
            this.bundle.putString(KEY_EXTRA_DATA, jSONObject.toString());
        }
        return this;
    }

    public PlayerBuilder accessToken(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "461a27719abd0b6f9ce7e36355eb2864", RobustBitConfig.DEFAULT_VALUE)) {
            return (PlayerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "461a27719abd0b6f9ce7e36355eb2864");
        }
        this.bundle.putString(MediaActivity.KEY_ACCESS_TOKEN, str);
        return this;
    }

    public Bundle getBundle() {
        return this.bundle;
    }
}
