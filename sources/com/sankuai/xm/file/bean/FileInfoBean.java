package com.sankuai.xm.file.bean;

import com.dianping.titans.js.JsBridgeResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.file.util.b;
import com.sankuai.xm.im.message.bean.Message;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class FileInfoBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String attach;
    private String bigUrl;
    private String category;
    private String contentType;
    private long createTime;
    private long creatorId;
    private String creatorName;
    private String extension;
    private long id;
    private int isDir;
    private long linkCreateTime;
    private String linkId;
    private long linkUpdateTime;
    private String linkUrl;
    private String md5;
    private long messageId;
    private String name;
    private long opTime;
    private long operationId;
    private long operationUserId;
    private String operationUserName;
    private long ownerId;
    private String ownerName;
    private int ownerType;
    private long parentId;
    private String props;
    private String reqUrl;
    private String screenshotUrl;
    private String serverPath;
    private long size;
    private String thumbUrl;
    private String token;
    private boolean unknownSource;
    private long updateTime;
    private String url;
    private long xmCid;

    public FileInfoBean() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bcef602c2742fdce59bc7919bdff98f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bcef602c2742fdce59bc7919bdff98f");
            return;
        }
        this.extension = null;
        this.id = 0L;
        this.parentId = 0L;
        this.ownerId = 0L;
        this.ownerType = 0;
        this.name = "";
        this.isDir = -1;
        this.md5 = "";
        this.contentType = "";
        this.category = "";
        this.size = 0L;
        this.serverPath = "";
        this.operationId = 0L;
        this.createTime = 0L;
        this.updateTime = 0L;
        this.operationUserId = 0L;
        this.operationUserName = "";
        this.messageId = 0L;
        this.ownerName = "";
        this.url = "";
        this.thumbUrl = "";
        this.bigUrl = "";
        this.screenshotUrl = "";
        this.linkCreateTime = 0L;
        this.linkUpdateTime = 0L;
        this.linkUrl = "";
        this.linkId = "";
        this.xmCid = 0L;
        this.props = "";
        this.creatorId = 0L;
        this.reqUrl = "";
        this.attach = "";
        this.creatorName = "";
        this.token = "";
    }

    public void deserializeJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e739518b1693b1eb938d118cdd439a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e739518b1693b1eb938d118cdd439a9");
        } else if (jSONObject == null) {
        } else {
            try {
                this.id = jSONObject.optLong("id");
                this.parentId = jSONObject.optLong("parentId");
                this.ownerId = jSONObject.optLong("ownerId");
                this.ownerType = jSONObject.optInt("ownerType");
                this.name = jSONObject.optString("name");
                this.isDir = jSONObject.optInt("isDir");
                this.md5 = jSONObject.optString("md5");
                this.contentType = jSONObject.optString("contentType");
                this.category = jSONObject.optString("category");
                this.size = jSONObject.optLong(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE);
                this.serverPath = jSONObject.optString("path");
                this.operationId = jSONObject.optLong("operationId");
                this.createTime = jSONObject.optLong(Message.CTS);
                this.updateTime = jSONObject.optLong("uts");
                this.opTime = jSONObject.optLong("opTime");
                this.operationUserId = jSONObject.optLong("opverUserId");
                this.operationUserName = jSONObject.optString("opverUserName");
                this.messageId = jSONObject.optLong("messageId");
                this.ownerName = jSONObject.optString("ownerName");
                this.url = jSONObject.optString("url");
                this.thumbUrl = jSONObject.optString("thumbUrl");
                this.bigUrl = jSONObject.optString("bigUrl");
                this.screenshotUrl = jSONObject.optString("screenshotUrl");
                this.linkCreateTime = jSONObject.optLong("linkCts");
                this.linkUpdateTime = jSONObject.optLong("linkUts");
                this.linkUrl = jSONObject.optString("linkUrl");
                this.linkId = jSONObject.optString("linkId");
                this.xmCid = jSONObject.optLong("xmCid");
                this.creatorId = jSONObject.optLong("creatorId");
                this.reqUrl = jSONObject.optString("reqUrl");
                this.attach = jSONObject.optString("attach");
                this.creatorName = jSONObject.optString("creatorName");
                if (jSONObject.optJSONObject("props") != null) {
                    this.props = jSONObject.optJSONObject("props").toString();
                }
                if (jSONObject.optJSONObject("extension") != null) {
                    this.extension = jSONObject.optJSONObject("extension").toString();
                }
                this.token = jSONObject.optString("token", "");
                if (ac.a(this.token)) {
                    b.c("FileInfoBean::deserializeJson::token is empty, url=" + this.url, new Object[0]);
                }
                this.unknownSource = jSONObject.optBoolean("unknownSource", false);
            } catch (Exception e) {
                b.a(e);
            }
        }
    }

    public long getId() {
        return this.id;
    }

    public void setId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb391269b755aa054520612c2b8f2fa7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb391269b755aa054520612c2b8f2fa7");
        } else {
            this.id = j;
        }
    }

    public long getParentId() {
        return this.parentId;
    }

    public long getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb71b241685f5e226dfd6892762737f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb71b241685f5e226dfd6892762737f3");
        } else {
            this.ownerId = j;
        }
    }

    public int getOwnerType() {
        return this.ownerType;
    }

    public void setOwnerType(int i) {
        this.ownerType = i;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public int getIsDir() {
        return this.isDir;
    }

    public void setIsDir(int i) {
        this.isDir = i;
    }

    public String getMd5() {
        return this.md5;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public String getContentType() {
        return this.contentType;
    }

    public void setContentType(String str) {
        this.contentType = str;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public long getSize() {
        return this.size;
    }

    public void setSize(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e76a99c067134b0f62781276c349f8ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e76a99c067134b0f62781276c349f8ea");
        } else {
            this.size = j;
        }
    }

    public String getServerPath() {
        return this.serverPath;
    }

    public void setServerPath(String str) {
        this.serverPath = str;
    }

    public long getOperationId() {
        return this.operationId;
    }

    public void setOperationId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b05dbfaad6b34cb3124bcf47e3e25c33", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b05dbfaad6b34cb3124bcf47e3e25c33");
        } else {
            this.operationId = j;
        }
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eaad079b756c22b08ae60b7c49014239", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eaad079b756c22b08ae60b7c49014239");
        } else {
            this.createTime = j;
        }
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe430005996bdd9d8339733ad06bacb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe430005996bdd9d8339733ad06bacb3");
        } else {
            this.updateTime = j;
        }
    }

    public long getOperationUserId() {
        return this.operationUserId;
    }

    public void setOperationUserId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97a054e2548c9591dbeb82a5119ee330", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97a054e2548c9591dbeb82a5119ee330");
        } else {
            this.operationUserId = j;
        }
    }

    public String getOperationUserName() {
        return this.operationUserName;
    }

    public void setOperationUserName(String str) {
        this.operationUserName = str;
    }

    public long getMessageId() {
        return this.messageId;
    }

    public void setMessageId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f8de5889eeed7d61ac7d5c1891633d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f8de5889eeed7d61ac7d5c1891633d6");
        } else {
            this.messageId = j;
        }
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String str) {
        this.ownerName = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String getThumbUrl() {
        return this.thumbUrl;
    }

    public void setThumbUrl(String str) {
        this.thumbUrl = str;
    }

    public String getBigUrl() {
        return this.bigUrl;
    }

    public void setBigUrl(String str) {
        this.bigUrl = str;
    }

    public String getScreenshotUrl() {
        return this.screenshotUrl;
    }

    public void setScreenshotUrl(String str) {
        this.screenshotUrl = str;
    }

    public long getLinkCreateTime() {
        return this.linkCreateTime;
    }

    public void setLinkCreateTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2d951a4736cd645baa7f8967bf44093", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2d951a4736cd645baa7f8967bf44093");
        } else {
            this.linkCreateTime = j;
        }
    }

    public long getLinkUpdateTime() {
        return this.linkUpdateTime;
    }

    public void setLinkUpdateTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee4bda850548ccd4369f1ef77ffcf3d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee4bda850548ccd4369f1ef77ffcf3d0");
        } else {
            this.linkUpdateTime = j;
        }
    }

    public long getOpTime() {
        return this.opTime;
    }

    public void setOpTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d88dd34ba8e9243293f468f4dc51aaa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d88dd34ba8e9243293f468f4dc51aaa");
        } else {
            this.opTime = j;
        }
    }

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public void setLinkUrl(String str) {
        this.linkUrl = str;
    }

    public String getLinkId() {
        return this.linkId;
    }

    public void setLinkId(String str) {
        this.linkId = str;
    }

    public long getXmCid() {
        return this.xmCid;
    }

    public void setXmCid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "422d025c3520a3cc3dfc635d87a6eb92", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "422d025c3520a3cc3dfc635d87a6eb92");
        } else {
            this.xmCid = j;
        }
    }

    public String getProps() {
        return this.props;
    }

    public void setProps(String str) {
        this.props = str;
    }

    public String getExtension() {
        return this.extension;
    }

    public void setExtension(String str) {
        this.extension = str;
    }

    public long getCreatorId() {
        return this.creatorId;
    }

    public void setCreatorId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0f64ea6adeb8df4b5a58dc793e1c905", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0f64ea6adeb8df4b5a58dc793e1c905");
        } else {
            this.creatorId = j;
        }
    }

    public String getReqUrl() {
        return this.reqUrl;
    }

    public void setReqUrl(String str) {
        this.reqUrl = str;
    }

    public String getAttach() {
        return this.attach;
    }

    public void setAttach(String str) {
        this.attach = str;
    }

    public String getCreatorName() {
        return this.creatorName;
    }

    public void setCreatorName(String str) {
        this.creatorName = str;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public boolean isUnknownSource() {
        return this.unknownSource;
    }
}
