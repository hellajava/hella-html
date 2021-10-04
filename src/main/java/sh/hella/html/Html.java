package sh.hella.html;

import sh.hella.html.document.AttributeSection;
import sh.hella.html.document.CompositeAttributeSection;
import sh.hella.html.document.ElementSection;
import sh.hella.html.document.HtmlElementSection;
import sh.hella.html.document.Section;
import sh.hella.html.document.TextSection;
import sh.hella.html.event.Event;
import sh.hella.html.event.EventHandler;
import sh.hella.html.event.impl.OnChange;
import sh.hella.html.event.impl.OnClick;
import sh.hella.html.event.impl.OnInput;
import sh.hella.html.event.impl.ValueEvent;
import sh.hella.html.handler.RpcMessageDecoder;
import sh.hella.html.handler.WebSocketHandler;

import java.util.UUID;

/**
 * The interface Html.
 */
@SuppressWarnings("unused")
public interface Html {

    /**
     * Text section.
     *
     * @param text the text
     * @return the section
     */
    static TextSection text(String text) {
        return new TextSection(text);
    }

    // Attributes

    /**
     * Attribute.
     *
     * @param key   the key
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection attr(String key, String value) {
        return new AttributeSection(key, value);
    }

    /**
     * Onclick attribute with event handler.
     *
     * @param eventHandler The event handler
     * @return The onclick attribute
     */
    static AttributeSection onclick(EventHandler<OnClick> eventHandler) {
        return onAttribute("onclick", OnClick.class, eventHandler);
    }

    /**
     * Onchange attribute section.
     *
     * @param eventHandler the event handler
     * @return the attribute section
     */
    static AttributeSection onchange(EventHandler<OnChange> eventHandler) {
        return onAttributeWithValue("onchange", OnChange.class, eventHandler);
    }

    /**
     * Oninput attribute section.
     *
     * @param eventHandler the event handler
     * @return the attribute section
     */
    static AttributeSection oninput(EventHandler<OnInput> eventHandler) {
        return onAttributeWithValue("oninput", OnInput.class, eventHandler);
    }

    /**
     * On attribute with value.
     *
     * @param event The JavaScript event type
     * @param eventType The class event type
     * @param eventHandler The event handler
     * @param <E> The event type
     * @return the attribute section
     */
    static <E extends ValueEvent> AttributeSection onAttributeWithValue(
            String event, Class<E> eventType, EventHandler<E> eventHandler) {
        String rpcUuid = UUID.randomUUID().toString();
        RpcMessageDecoder<E> decoder = new RpcMessageDecoder<E>(eventHandler, eventType);
        WebSocketHandler.RPC_DECODER_MAP.put(rpcUuid, decoder);
        String valueSelector = "document.querySelector('[data-rpc-uuid=&quot;" + rpcUuid + "&quot;]').value";
        return new CompositeAttributeSection(
                new AttributeSection("data-rpc-uuid", rpcUuid),
                new AttributeSection(event, "_hella_rpc('" + rpcUuid + "', { value: " + valueSelector + " })")
        );
    }

    /**
     * On attribute section.
     *
     * @param <E>          the type parameter
     * @param event        the event
     * @param eventType    the event type
     * @param eventHandler the event handler
     * @return the attribute section
     */
    static <E extends Event> AttributeSection onAttribute(
            String event, Class<E> eventType, EventHandler<E> eventHandler) {
        RpcMessageDecoder<E> decoder = new RpcMessageDecoder<E>(eventHandler, eventType);
        String rpcUuid = UUID.randomUUID().toString();
        WebSocketHandler.RPC_DECODER_MAP.put(rpcUuid, decoder);
        return new AttributeSection(event, "_hella_rpc('" + rpcUuid + "')");
    }

    /**
     * Accept attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection accept(String value) {
        return attr("href", value);
    }

    /**
     * Accept charset attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection accept_charset(String value) {
        return attr("accept-charset", value);
    }

    /**
     * Accesskey attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection accesskey(String value) {
        return attr("accesskey", value);
    }

    /**
     * Action attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection action(String value) {
        return attr("action", value);
    }

    /**
     * Align attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection align(String value) {
        return attr("align", value);
    }

    /**
     * Allow attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection allow(String value) {
        return attr("allow", value);
    }

    /**
     * Alt attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection alt(String value) {
        return attr("alt", value);
    }

    /**
     * Async attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection async(String value) {
        return attr("async", value);
    }

    /**
     * Autocapitalize attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection autocapitalize(String value) {
        return attr("autocapitalize", value);
    }

    /**
     * Autocomplete attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection autocomplete(String value) {
        return attr("autocomplete", value);
    }

    /**
     * Autofocus attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection autofocus(String value) {
        return attr("autofocus", value);
    }

    /**
     * Autoplay attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection autoplay(String value) {
        return attr("autoplay", value);
    }

    /**
     * Background attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection background(String value) {
        return attr("background", value);
    }

    /**
     * Bgcolor attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection bgcolor(String value) {
        return attr("bgcolor", value);
    }

    /**
     * Border attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection border(String value) {
        return attr("border", value);
    }

    /**
     * Buffered attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection buffered(String value) {
        return attr("buffered", value);
    }

    /**
     * Capture attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection capture(String value) {
        return attr("capture", value);
    }

    /**
     * Challenge attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection challenge(String value) {
        return attr("challenge", value);
    }

    /**
     * Charset attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection charset(String value) {
        return attr("charset", value);
    }

    /**
     * Checked attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection checked(String value) {
        return attr("checked", value);
    }

    /**
     * Cite attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection cite(String value) {
        return attr("cite", value);
    }

    /**
     * Class name attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection className(String value) {
        return attr("class", value);
    }

    /**
     * Clazz attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection clazz(String value) {
        return attr("class", value);
    }

    /**
     * Classs attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection classs(String value) {
        return attr("class", value);
    }

    /**
     * Code attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection code(String value) {
        return attr("code", value);
    }

    /**
     * Codebase attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection codebase(String value) {
        return attr("codebase", value);
    }

    /**
     * Color attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection color(String value) {
        return attr("color", value);
    }

    /**
     * Cols attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection cols(String value) {
        return attr("cols", value);
    }

    /**
     * Colspan attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection colspan(String value) {
        return attr("colspan", value);
    }

    /**
     * Content attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection content(String value) {
        return attr("content", value);
    }

    /**
     * Contenteditable attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection contenteditable(String value) {
        return attr("contenteditable", value);
    }

    /**
     * Contextmenu attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection contextmenu(String value) {
        return attr("contextmenu", value);
    }

    /**
     * Controls attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection controls(String value) {
        return attr("controls", value);
    }

    /**
     * Coords attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection coords(String value) {
        return attr("coords", value);
    }

    /**
     * Crossorigin attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection crossorigin(String value) {
        return attr("crossorigin", value);
    }

    /**
     * Csp attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection csp(String value) {
        return attr("csp", value);
    }

    /**
     * Data attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection data(String value) {
        return attr("data", value);
    }

    /**
     * Data attribute section.
     *
     * @param key   the key
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection data_(String key, String value) {
        return attr("data-" + key, value);
    }

    /**
     * Datetime attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection datetime(String value) {
        return attr("datetime", value);
    }

    /**
     * Decoding attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection decoding(String value) {
        return attr("decoding", value);
    }

    /**
     * Dfault attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection dfault(String value) {
        return attr("default", value);
    }

    /**
     * Defaultt attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection defaultt(String value) {
        return attr("default", value);
    }

    /**
     * Defer attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection defer(String value) {
        return attr("defer", value);
    }

    /**
     * Dir attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection dir(String value) {
        return attr("dir", value);
    }

    /**
     * Dirname attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection dirname(String value) {
        return attr("dirname", value);
    }

    /**
     * Disabled attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection disabled(String value) {
        return attr("disabled", value);
    }

    /**
     * Download attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection download(String value) {
        return attr("download", value);
    }

    /**
     * Draggable attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection draggable(String value) {
        return attr("draggable", value);
    }

    /**
     * Enctype attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection enctype(String value) {
        return attr("enctype", value);
    }

    /**
     * Enterkeyhint attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection enterkeyhint(String value) {
        return attr("enterkeyhint", value);
    }

    /**
     * For attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection htmlFor(String value) {
        return attr("for", value);
    }

    /**
     * Form attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection form(String value) {
        return attr("form", value);
    }

    /**
     * Formaction attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection formaction(String value) {
        return attr("formaction", value);
    }

    /**
     * Formenctype attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection formenctype(String value) {
        return attr("formenctype", value);
    }

    /**
     * Formmethod attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection formmethod(String value) {
        return attr("formmethod", value);
    }

    /**
     * Formnovalidate attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection formnovalidate(String value) {
        return attr("formnovalidate", value);
    }

    /**
     * Formtarget attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection formtarget(String value) {
        return attr("formtarget", value);
    }

    /**
     * Headers attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection headers(String value) {
        return attr("headers", value);
    }

    /**
     * Height attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection height(String value) {
        return attr("height", value);
    }

    /**
     * Hidden attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection hidden(String value) {
        return attr("hidden", value);
    }

    /**
     * High attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection high(String value) {
        return attr("high", value);
    }

    /**
     * Href attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection href(String value) {
        return attr("href", value);
    }

    /**
     * Hreflang attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection hreflang(String value) {
        return attr("hreflang", value);
    }

    /**
     * Http equiv attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection http_equiv(String value) {
        return attr("http-equiv", value);
    }

    /**
     * Icon attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection icon(String value) {
        return attr("icon", value);
    }

    /**
     * Id attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection id(String value) {
        return attr("id", value);
    }

    /**
     * Importance attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection importance(String value) {
        return attr("importance", value);
    }

    /**
     * Integrity attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection integrity(String value) {
        return attr("integrity", value);
    }

    /**
     * Intrinsicsize attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection intrinsicsize(String value) {
        return attr("intrinsicsize", value);
    }

    /**
     * Inputmode attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection inputmode(String value) {
        return attr("inputmode", value);
    }

    /**
     * Ismap attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection ismap(String value) {
        return attr("ismap", value);
    }

    /**
     * Itemprop attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection itemprop(String value) {
        return attr("itemprop", value);
    }

    /**
     * Keytype attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection keytype(String value) {
        return attr("keytype", value);
    }

    /**
     * Kind attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection kind(String value) {
        return attr("kind", value);
    }

    /**
     * Label attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection label(String value) {
        return attr("label", value);
    }

    /**
     * Lang attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection lang(String value) {
        return attr("lang", value);
    }

    /**
     * Language attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection language(String value) {
        return attr("language", value);
    }

    /**
     * Loading attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection loading(String value) {
        return attr("loading", value);
    }

    /**
     * List attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection list(String value) {
        return attr("list", value);
    }

    /**
     * Loop attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection loop(String value) {
        return attr("loop", value);
    }

    /**
     * Low attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection low(String value) {
        return attr("low", value);
    }

    /**
     * Manifest attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection manifest(String value) {
        return attr("manifest", value);
    }

    /**
     * Max attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection max(String value) {
        return attr("max", value);
    }

    /**
     * Maxlength attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection maxlength(String value) {
        return attr("maxlength", value);
    }

    /**
     * Minlength attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection minlength(String value) {
        return attr("minlength", value);
    }

    /**
     * Media attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection media(String value) {
        return attr("media", value);
    }

    /**
     * Method attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection method(String value) {
        return attr("method", value);
    }

    /**
     * Min attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection min(String value) {
        return attr("min", value);
    }

    /**
     * Multiple attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection multiple(String value) {
        return attr("multiple", value);
    }

    /**
     * Muted attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection muted(String value) {
        return attr("muted", value);
    }

    /**
     * Name attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection name(String value) {
        return attr("name", value);
    }

    /**
     * Novalidate attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection novalidate(String value) {
        return attr("novalidate", value);
    }

    /**
     * Open attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection open(String value) {
        return attr("open", value);
    }

    /**
     * Optimum attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection optimum(String value) {
        return attr("optimum", value);
    }

    /**
     * Pattern attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection pattern(String value) {
        return attr("pattern", value);
    }

    /**
     * Ping attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection ping(String value) {
        return attr("ping", value);
    }

    /**
     * Placeholder attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection placeholder(String value) {
        return attr("placeholder", value);
    }

    /**
     * Poster attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection poster(String value) {
        return attr("poster", value);
    }

    /**
     * Preload attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection preload(String value) {
        return attr("preload", value);
    }

    /**
     * Radiogroup attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection radiogroup(String value) {
        return attr("radiogroup", value);
    }

    /**
     * Readonly attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection readonly(String value) {
        return attr("readonly", value);
    }

    /**
     * Referrerpolicy attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection referrerpolicy(String value) {
        return attr("referrerpolicy", value);
    }

    /**
     * Rel attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection rel(String value) {
        return attr("rel", value);
    }

    /**
     * Required attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection required(String value) {
        return attr("required", value);
    }

    /**
     * Reversed attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection reversed(String value) {
        return attr("reversed", value);
    }

    /**
     * Rows attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection rows(String value) {
        return attr("rows", value);
    }

    /**
     * Rowspan attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection rowspan(String value) {
        return attr("rowspan", value);
    }

    /**
     * Sandbox attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection sandbox(String value) {
        return attr("sandbox", value);
    }

    /**
     * Scope attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection scope(String value) {
        return attr("scope", value);
    }

    /**
     * Scoped attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection scoped(String value) {
        return attr("scoped", value);
    }

    /**
     * Selected attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection selected(String value) {
        return attr("selected", value);
    }

    /**
     * Shape attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection shape(String value) {
        return attr("shape", value);
    }

    /**
     * Size attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection size(String value) {
        return attr("size", value);
    }

    /**
     * Sizes attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection sizes(String value) {
        return attr("sizes", value);
    }

    /**
     * Slot attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection slot(String value) {
        return attr("slot", value);
    }

    /**
     * Span attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection span(String value) {
        return attr("span", value);
    }

    /**
     * Spellcheck attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection spellcheck(String value) {
        return attr("spellcheck", value);
    }

    /**
     * Src attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection src(String value) {
        return attr("src", value);
    }

    /**
     * Srcdoc attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection srcdoc(String value) {
        return attr("srcdoc", value);
    }

    /**
     * Srclang attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection srclang(String value) {
        return attr("srclang", value);
    }

    /**
     * Srcset attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection srcset(String value) {
        return attr("srcset", value);
    }

    /**
     * Start attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection start(String value) {
        return attr("start", value);
    }

    /**
     * Step attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection step(String value) {
        return attr("step", value);
    }

    /**
     * Style attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection style(String value) {
        return attr("style", value);
    }

    /**
     * Summary attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection summary(String value) {
        return attr("summary", value);
    }

    /**
     * Tabindex attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection tabindex(String value) {
        return attr("tabindex", value);
    }

    /**
     * Target attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection target(String value) {
        return attr("target", value);
    }

    /**
     * Title attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection title(String value) {
        return attr("title", value);
    }

    /**
     * Translate attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection translate(String value) {
        return attr("translate", value);
    }

    /**
     * Type attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection type(String value) {
        return attr("type", value);
    }

    /**
     * Usemap attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection usemap(String value) {
        return attr("usemap", value);
    }

    /**
     * Value attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection value(String value) {
        return attr("value", value);
    }

    /**
     * Width attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection width(String value) {
        return attr("width", value);
    }

    /**
     * Wrap attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static AttributeSection wrap(String value) {
        return attr("wrap", value);
    }

    // Tags

    /**
     * Tag element.
     *
     * @param name     the name
     * @param children the children
     * @return the element
     */
    static ElementSection tag(String name, Section... children) {
        return new ElementSection(name, children);
    }

    // Main root

    /**
     * Html element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection html(Section... children) {
        return new HtmlElementSection(children);
    }

    // Document metadata

    /**
     * Base element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection base(Section... children) {
        return tag("base", children);
    }

    /**
     * Head element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection head(Section... children) {
        return tag("head", children);
    }

    /**
     * Link element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection link(Section... children) {
        return tag("link", children);
    }

    /**
     * Meta element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection meta(Section... children) {
        return tag("meta", children);
    }

    /**
     * Style element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection style(Section... children) {
        return tag("style", children);
    }

    /**
     * Title element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection title(Section... children) {
        return tag("title", children);
    }

    // Sectioning root

    /**
     * Body element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection body(Section... children) {
        return tag("body", children);
    }

    // Content sectioning


    /**
     * Address element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection address(Section... children) {
        return tag("address", children);
    }

    /**
     * Article element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection article(Section... children) {
        return tag("article", children);
    }

    /**
     * Aside element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection aside(Section... children) {
        return tag("aside", children);
    }

    /**
     * Footer element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection footer(Section... children) {
        return tag("footer", children);
    }

    /**
     * Header element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection header(Section... children) {
        return tag("header", children);
    }

    /**
     * H 1 element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection h1(Section... children) {
        return tag("h1", children);
    }

    /**
     * H 2 element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection h2(Section... children) {
        return tag("h2", children);
    }

    /**
     * H 3 element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection h3(Section... children) {
        return tag("h3", children);
    }

    /**
     * H 4 element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection h4(Section... children) {
        return tag("h4", children);
    }

    /**
     * H 5 element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection h5(Section... children) {
        return tag("h5", children);
    }

    /**
     * H 6 element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection h6(Section... children) {
        return tag("h6", children);
    }

    /**
     * Main element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection main(Section... children) {
        return tag("main", children);
    }

    /**
     * Nav element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection nav(Section... children) {
        return tag("nav", children);
    }

    /**
     * Section element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection section(Section... children) {
        return tag("section", children);
    }

    // Text content

    /**
     * Blockquote element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection blockquote(Section... children) {
        return tag("blockquote", children);
    }

    /**
     * Dd element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection dd(Section... children) {
        return tag("dd", children);
    }

    /**
     * Div element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection div(Section... children) {
        return tag("div", children);
    }

    /**
     * Dl element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection dl(Section... children) {
        return tag("dl", children);
    }

    /**
     * Dt element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection dt(Section... children) {
        return tag("dt", children);
    }

    /**
     * Figcaption element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection figcaption(Section... children) {
        return tag("figcaption", children);
    }

    /**
     * Figure element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection figure(Section... children) {
        return tag("figure", children);
    }

    /**
     * Hr element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection hr(Section... children) {
        return tag("hr", children);
    }

    /**
     * Li element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection li(Section... children) {
        return tag("li", children);
    }

    /**
     * Ol element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection ol(Section... children) {
        return tag("ol", children);
    }

    /**
     * P element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection p(Section... children) {
        return tag("p", children);
    }

    /**
     * Pre element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection pre(Section... children) {
        return tag("pre", children);
    }

    /**
     * Ul element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection ul(Section... children) {
        return tag("ul", children);
    }

    // Inline text semantics

    /**
     * A element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection a(Section... children) {
        return tag("a", children);
    }

    /**
     * Abbr element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection abbr(Section... children) {
        return tag("abbr", children);
    }

    /**
     * B element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection b(Section... children) {
        return tag("b", children);
    }

    /**
     * Bdi element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection bdi(Section... children) {
        return tag("bdi", children);
    }

    /**
     * Bdo element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection bdo(Section... children) {
        return tag("bdo", children);
    }

    /**
     * Br element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection br(Section... children) {
        return tag("br", children);
    }

    /**
     * Cite element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection cite(Section... children) {
        return tag("cite", children);
    }

    /**
     * Code element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection code(Section... children) {
        return tag("code", children);
    }

    /**
     * Data element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection data(Section... children) {
        return tag("data", children);
    }

    /**
     * Dfn element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection dfn(Section... children) {
        return tag("dfn", children);
    }

    /**
     * Em element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection em(Section... children) {
        return tag("em", children);
    }

    /**
     * element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection i(Section... children) {
        return tag("i", children);
    }

    /**
     * Kbd element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection kbd(Section... children) {
        return tag("kbd", children);
    }

    /**
     * Mark element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection mark(Section... children) {
        return tag("mark", children);
    }

    /**
     * Q element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection q(Section... children) {
        return tag("q", children);
    }

    /**
     * Rp element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection rp(Section... children) {
        return tag("rp", children);
    }

    /**
     * Rt element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection rt(Section... children) {
        return tag("rt", children);
    }

    /**
     * Ruby element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection ruby(Section... children) {
        return tag("ruby", children);
    }

    /**
     * S element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection s(Section... children) {
        return tag("s", children);
    }

    /**
     * Samp element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection samp(Section... children) {
        return tag("samp", children);
    }

    /**
     * Small element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection small(Section... children) {
        return tag("small", children);
    }

    /**
     * Span element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection span(Section... children) {
        return tag("span", children);
    }

    /**
     * Strong element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection strong(Section... children) {
        return tag("strong", children);
    }

    /**
     * Sub element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection sub(Section... children) {
        return tag("sub", children);
    }

    /**
     * Sup element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection sup(Section... children) {
        return tag("sup", children);
    }

    /**
     * Time element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection time(Section... children) {
        return tag("time", children);
    }

    /**
     * U element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection u(Section... children) {
        return tag("u", children);
    }

    /**
     * Var element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection var(Section... children) {
        return tag("var", children);
    }

    /**
     * Wbr element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection wbr(Section... children) {
        return tag("wbr", children);
    }

    // Image and multimedia

    /**
     * Area element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection area(Section... children) {
        return tag("area", children);
    }

    /**
     * Audio element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection audio(Section... children) {
        return tag("audio", children);
    }

    /**
     * Img element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection img(Section... children) {
        return tag("img", children);
    }

    /**
     * Map element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection map(Section... children) {
        return tag("map", children);
    }

    /**
     * Track element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection track(Section... children) {
        return tag("track", children);
    }

    /**
     * Video element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection video(Section... children) {
        return tag("video", children);
    }

    // Embedded content

    /**
     * Embed element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection embed(Section... children) {
        return tag("embed", children);
    }

    /**
     * Iframe element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection iframe(Section... children) {
        return tag("iframe", children);
    }

    /**
     * Object element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection object(Section... children) {
        return tag("objcet", children);
    }

    /**
     * Param element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection param(Section... children) {
        return tag("param", children);
    }

    /**
     * Picture element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection picture(Section... children) {
        return tag("picture", children);
    }

    /**
     * Portal element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection portal(Section... children) {
        return tag("portal", children);
    }

    /**
     * Source element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection source(Section... children) {
        return tag("source", children);
    }

    // SVG and MathML

    /**
     * Svg element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection svg(Section... children) {
        return tag("svg", children);
    }

    /**
     * Math element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection math(Section... children) {
        return tag("math", children);
    }

    // Scripting

    /**
     * Canvas element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection canvas(Section... children) {
        return tag("canvas", children);
    }

    /**
     * Noscript element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection noscript(Section... children) {
        return tag("noscript", children);
    }

    /**
     * Script element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection script(Section... children) {
        return tag("script", children);
    }

    // Demarcating edits

    /**
     * Del element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection del(Section... children) {
        return tag("del", children);
    }

    /**
     * Ins element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection ins(Section... children) {
        return tag("ins", children);
    }

    // Table content

    /**
     * Caption element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection caption(Section... children) {
        return tag("caption", children);
    }

    /**
     * Col element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection col(Section... children) {
        return tag("col", children);
    }

    /**
     * Colgroup element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection colgroup(Section... children) {
        return tag("colgroup", children);
    }

    /**
     * Table element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection table(Section... children) {
        return tag("table", children);
    }

    /**
     * Tbody element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection tbody(Section... children) {
        return tag("tbody", children);
    }

    /**
     * Td element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection td(Section... children) {
        return tag("td", children);
    }

    /**
     * Tfoot element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection tfoot(Section... children) {
        return tag("tfoot", children);
    }

    /**
     * Th element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection th(Section... children) {
        return tag("th", children);
    }

    /**
     * Thead element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection thead(Section... children) {
        return tag("thead", children);
    }

    /**
     * Tr element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection tr(Section... children) {
        return tag("tr", children);
    }

    // Forms

    /**
     * Button element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection button(Section... children) {
        return tag("button", children);
    }

    /**
     * Datalist element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection datalist(Section... children) {
        return tag("datalist", children);
    }

    /**
     * Fieldset element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection fieldset(Section... children) {
        return tag("fieldset", children);
    }

    /**
     * Form element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection form(Section... children) {
        return tag("form", children);
    }

    /**
     * Input element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection input(Section... children) {
        return tag("input", children);
    }

    /**
     * Label element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection label(Section... children) {
        return tag("label", children);
    }

    /**
     * Legend element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection legend(Section... children) {
        return tag("legend", children);
    }

    /**
     * Meter element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection meter(Section... children) {
        return tag("meter", children);
    }

    /**
     * Optgroup element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection optgroup(Section... children) {
        return tag("optgroup", children);
    }

    /**
     * Option element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection option(Section... children) {
        return tag("option", children);
    }

    /**
     * Output element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection output(Section... children) {
        return tag("output", children);
    }

    /**
     * Progress element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection progress(Section... children) {
        return tag("progress", children);
    }

    /**
     * Select element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection select(Section... children) {
        return tag("select", children);
    }

    /**
     * Textarea element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection textarea(Section... children) {
        return tag("textarea", children);
    }

    // Interactive elements

    /**
     * Details element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection details(Section... children) {
        return tag("details", children);
    }

    /**
     * Dialog element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection dialog(Section... children) {
        return tag("dialog", children);
    }

    /**
     * Menu element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection menu(Section... children) {
        return tag("menu", children);
    }

    /**
     * Summary element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection summary(Section... children) {
        return tag("summary", children);
    }

    /**
     * Slot element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection slot(Section... children) {
        return tag("slot", children);
    }

    /**
     * Template element.
     *
     * @param children the children
     * @return the element
     */
    static ElementSection template(Section... children) {
        return tag("template", children);
    }
}
