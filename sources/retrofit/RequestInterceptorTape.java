package retrofit;

import java.util.ArrayList;
import java.util.List;
import retrofit.RequestInterceptor;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class RequestInterceptorTape implements RequestInterceptor, RequestInterceptor.RequestFacade {
    private final List<CommandWithParams> tape = new ArrayList();

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public enum Command {
        ADD_HEADER { // from class: retrofit.RequestInterceptorTape.Command.1
            @Override // retrofit.RequestInterceptorTape.Command
            public final void intercept(RequestInterceptor.RequestFacade requestFacade, String str, String str2) {
                requestFacade.addHeader(str, str2);
            }
        },
        ADD_PATH_PARAM { // from class: retrofit.RequestInterceptorTape.Command.2
            @Override // retrofit.RequestInterceptorTape.Command
            public final void intercept(RequestInterceptor.RequestFacade requestFacade, String str, String str2) {
                requestFacade.addPathParam(str, str2);
            }
        },
        ADD_ENCODED_PATH_PARAM { // from class: retrofit.RequestInterceptorTape.Command.3
            @Override // retrofit.RequestInterceptorTape.Command
            public final void intercept(RequestInterceptor.RequestFacade requestFacade, String str, String str2) {
                requestFacade.addEncodedPathParam(str, str2);
            }
        },
        ADD_QUERY_PARAM { // from class: retrofit.RequestInterceptorTape.Command.4
            @Override // retrofit.RequestInterceptorTape.Command
            public final void intercept(RequestInterceptor.RequestFacade requestFacade, String str, String str2) {
                requestFacade.addQueryParam(str, str2);
            }
        },
        ADD_ENCODED_QUERY_PARAM { // from class: retrofit.RequestInterceptorTape.Command.5
            @Override // retrofit.RequestInterceptorTape.Command
            public final void intercept(RequestInterceptor.RequestFacade requestFacade, String str, String str2) {
                requestFacade.addEncodedQueryParam(str, str2);
            }
        };

        abstract void intercept(RequestInterceptor.RequestFacade requestFacade, String str, String str2);
    }

    @Override // retrofit.RequestInterceptor.RequestFacade
    public final void addHeader(String str, String str2) {
        this.tape.add(new CommandWithParams(Command.ADD_HEADER, str, str2));
    }

    @Override // retrofit.RequestInterceptor.RequestFacade
    public final void addPathParam(String str, String str2) {
        this.tape.add(new CommandWithParams(Command.ADD_PATH_PARAM, str, str2));
    }

    @Override // retrofit.RequestInterceptor.RequestFacade
    public final void addEncodedPathParam(String str, String str2) {
        this.tape.add(new CommandWithParams(Command.ADD_ENCODED_PATH_PARAM, str, str2));
    }

    @Override // retrofit.RequestInterceptor.RequestFacade
    public final void addQueryParam(String str, String str2) {
        this.tape.add(new CommandWithParams(Command.ADD_QUERY_PARAM, str, str2));
    }

    @Override // retrofit.RequestInterceptor.RequestFacade
    public final void addEncodedQueryParam(String str, String str2) {
        this.tape.add(new CommandWithParams(Command.ADD_ENCODED_QUERY_PARAM, str, str2));
    }

    @Override // retrofit.RequestInterceptor
    public final void intercept(RequestInterceptor.RequestFacade requestFacade) {
        for (CommandWithParams commandWithParams : this.tape) {
            commandWithParams.command.intercept(requestFacade, commandWithParams.name, commandWithParams.value);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class CommandWithParams {
        final Command command;
        final String name;
        final String value;

        CommandWithParams(Command command, String str, String str2) {
            this.command = command;
            this.name = str;
            this.value = str2;
        }
    }
}
