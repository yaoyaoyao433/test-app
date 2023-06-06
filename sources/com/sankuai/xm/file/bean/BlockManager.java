package com.sankuai.xm.file.bean;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class BlockManager {
    public static final int BLOCK_STATE_FINISHED = 1;
    public static final int BLOCK_STATE_INIT = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<Block> mBlockList;
    private String mUploadId;

    public BlockManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "366ef517e6e5bf95daf4281518692cc4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "366ef517e6e5bf95daf4281518692cc4");
            return;
        }
        this.mBlockList = new LinkedList();
        this.mUploadId = "";
    }

    public void addBlock(Block block) {
        Object[] objArr = {block};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ae32a17d5e4058d0e4c4c21c2d2b816", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ae32a17d5e4058d0e4c4c21c2d2b816");
        } else {
            this.mBlockList.add(block);
        }
    }

    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "286270ac313593c3d6234d91c0c078e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "286270ac313593c3d6234d91c0c078e4");
        } else {
            this.mBlockList.clear();
        }
    }

    public List<Block> getBlockList() {
        return this.mBlockList;
    }

    public String getUploadId() {
        return this.mUploadId;
    }

    public void setUploadId(String str) {
        this.mUploadId = str;
    }

    public List<String> getPartIdList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fae096910b879113de3cbb9ea8a80247", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fae096910b879113de3cbb9ea8a80247");
        }
        ArrayList arrayList = new ArrayList();
        for (Block block : this.mBlockList) {
            arrayList.add(block.getPartId());
        }
        return arrayList;
    }

    public void jsonToObject(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45b54aab494d01191fcb61bcc5d2a4a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45b54aab494d01191fcb61bcc5d2a4a2");
        } else if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            this.mUploadId = jSONObject.getString("mUploadId");
            JSONArray jSONArray = jSONObject.getJSONArray("blockList");
            for (int i = 0; i < jSONArray.length(); i++) {
                Block block = new Block();
                block.deserializeJson(jSONArray.getJSONObject(i));
                this.mBlockList.add(block);
            }
        }
    }

    public JSONObject serializeObject() throws JSONException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "009a694e82582057e3f82f148ee5898e", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "009a694e82582057e3f82f148ee5898e");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mUploadId", this.mUploadId);
        JSONArray jSONArray = new JSONArray();
        for (Block block : this.mBlockList) {
            jSONArray.put(block.serializeObject());
        }
        jSONObject.put("blockList", jSONArray);
        return jSONObject;
    }
}
