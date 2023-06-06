package com.sankuai.xm.im.message.bean;

import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.utils.a;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TextMessage extends IMMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean mBold;
    private short mCipherType;
    private String mFontName;
    private int mFontSize;
    private String mText;

    public TextMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c7a85b49cbe4edaf559b3142b52ed9a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c7a85b49cbe4edaf559b3142b52ed9a");
            return;
        }
        this.mText = "";
        this.mFontName = "";
        this.mFontSize = 0;
        this.mBold = false;
        this.mCipherType = (short) 0;
        setMsgType(1);
    }

    public static TextMessage obtain(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "730689a09b01809ba060cb894ada05cb", 6917529027641081856L)) {
            return (TextMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "730689a09b01809ba060cb894ada05cb");
        }
        TextMessage textMessage = new TextMessage();
        textMessage.setText(str);
        textMessage.setMsgType(1);
        return textMessage;
    }

    public String getText() {
        return this.mText;
    }

    public void setText(String str) {
        this.mText = str;
    }

    public String getFontName() {
        return this.mFontName;
    }

    public void setFontName(String str) {
        this.mFontName = str;
    }

    public int getFontSize() {
        return this.mFontSize;
    }

    public void setFontSize(int i) {
        this.mFontSize = i;
    }

    public boolean isBold() {
        return this.mBold;
    }

    public void setBold(boolean z) {
        this.mBold = z;
    }

    public short getCipherType() {
        return this.mCipherType;
    }

    public void setCipherType(short s) {
        this.mCipherType = s;
    }

    @Override // com.sankuai.xm.im.message.bean.IMMessage
    public void copyTo(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4a9640245eb2916555f28046605873a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4a9640245eb2916555f28046605873a");
            return;
        }
        super.copyTo(iMMessage);
        if (iMMessage instanceof TextMessage) {
            TextMessage textMessage = (TextMessage) iMMessage;
            textMessage.mText = this.mText;
            textMessage.mFontName = this.mFontName;
            textMessage.mFontSize = this.mFontSize;
            textMessage.mBold = this.mBold;
            textMessage.mCipherType = this.mCipherType;
        }
    }

    @Override // com.sankuai.xm.im.message.bean.Message
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a65c2bc57dca24d97ba14e81fece416", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a65c2bc57dca24d97ba14e81fece416");
        }
        return "TextMessage{mText='" + this.mText + "', mFontName='" + this.mFontName + "', mFontSize=" + this.mFontSize + ", mBold=" + this.mBold + ", mCipherType=" + ((int) this.mCipherType) + ", key = " + super.keyParamToString() + '}';
    }

    @Override // com.sankuai.xm.im.message.bean.IMMessage
    public JSONObject toServerJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3426c95fd8446c78b1dc64fe83cc806d", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3426c95fd8446c78b1dc64fe83cc806d");
        }
        JSONObject baseServerJson = baseServerJson();
        if (baseServerJson != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("text", this.mText);
                jSONObject.put("font_name", this.mFontName);
                jSONObject.put("font_size", this.mFontSize);
                jSONObject.put(DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD, this.mBold);
                jSONObject.put("cipher_type", (int) this.mCipherType);
                baseServerJson.put("body", jSONObject);
                return baseServerJson;
            } catch (JSONException e) {
                a.a(e);
                return null;
            }
        }
        return null;
    }
}
