package com.tencent.map.tools.net;

import com.meituan.robust.common.CommonConstant;
import com.tencent.map.tools.net.exception.NetErrorException;
import com.tencent.map.tools.net.processor.Processor;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class NetResponse {
    public String contentEncoding;
    public int contentLength;
    public byte[] data;
    public InputStream dataStream;
    public byte[] errorData;
    public Exception exception;
    public long mRequestId;
    public String requestUrl;
    private List<Processor> respProcessorSet;
    public int statusCode;
    public int errorCode = -1;
    public String charset = CommonConstant.Encoding.GBK;
    public final Map<String, String> respHeads = new HashMap();

    public NetResponse() {
    }

    public NetResponse(NetRequest netRequest) {
        this.mRequestId = netRequest.mRequestId;
        this.respProcessorSet = netRequest.processors;
        this.requestUrl = netRequest.url;
    }

    public boolean available() {
        if (this.errorCode == 0 && this.statusCode == 200) {
            return true;
        }
        return this.data != null && this.data.length > 0;
    }

    public void exception(Exception exc) {
        this.exception = exc;
        if (exc instanceof NetErrorException) {
            NetErrorException netErrorException = (NetErrorException) exc;
            this.errorCode = netErrorException.errorCode;
            this.statusCode = netErrorException.statusCode;
        }
    }

    public void clone(NetResponse netResponse) {
        if (netResponse != null) {
            this.errorCode = netResponse.errorCode;
            this.statusCode = netResponse.statusCode;
            this.data = netResponse.data;
            this.charset = netResponse.charset;
            this.exception = netResponse.exception;
            this.errorData = netResponse.errorData;
        }
    }

    public String toString() {
        try {
            return this.data != null ? new String(this.data, this.charset) : "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String toHumanString() {
        if (this.data != null) {
            return "[DATA] " + (this.data.length / 1024.0f) + "KB " + new String(this.data, Charset.forName("utf-8"));
        } else if (this.errorData != null) {
            if (this.exception != null) {
                this.exception.printStackTrace();
            }
            return "[ERROR] " + new String(this.errorData);
        } else {
            return "";
        }
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getData() {
        return this.data != null ? new String(this.data) : "";
    }

    public String getErrorMessage() {
        if (this.errorData != null) {
            return new String(this.errorData);
        }
        return this.exception != null ? this.exception.getMessage() : "";
    }

    public String getHeaderField(String str) {
        return this.respHeads.get(str);
    }

    public InputStream getInputStream() {
        return this.dataStream;
    }

    public List<Processor> getProcessors() {
        return this.respProcessorSet;
    }
}
