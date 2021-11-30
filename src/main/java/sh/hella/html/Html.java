package sh.hella.html;

import sh.hella.html.document.Attribute;
import sh.hella.html.document.Element;
import sh.hella.html.document.EventAwareAttribute;
import sh.hella.html.document.HtmlElement;
import sh.hella.html.document.Section;
import sh.hella.html.document.TextSection;
import sh.hella.html.event.Event;
import sh.hella.html.event.EventHandler;
import sh.hella.html.event.impl.OnChange;
import sh.hella.html.event.impl.OnClick;
import sh.hella.html.event.impl.OnInput;
import sh.hella.html.event.impl.OnSubmit;

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
    static TextSection text(String text, Object... args) {
        return new TextSection(text, args);
    }

    // Attributes

    /**
     * Attribute.
     *
     * @param key   the key
     * @param value the value
     * @return the attribute section
     */
    static Attribute attr(String key, String value) {
        return new Attribute(key, value);
    }

    /**
     * Onclick attribute with event handler.
     *
     * @param eventHandler The event handler
     * @return The onclick attribute
     */
    static Attribute onclick(EventHandler<OnClick> eventHandler) {
        return onAttribute("onclick", OnClick.class, eventHandler);
    }

    /**
     * Onchange attribute section.
     *
     * @param eventHandler the event handler
     * @return the attribute section
     */
    static Attribute onchange(EventHandler<OnChange> eventHandler) {
        return onAttribute("onchange", OnChange.class, eventHandler);
    }

    /**
     * Oninput attribute section.
     *
     * @param eventHandler the event handler
     * @return the attribute section
     */
    static Attribute oninput(EventHandler<OnInput> eventHandler) {
        return onAttribute("oninput", OnInput.class, eventHandler);
    }

    /**
     * Onsubmit attribute section.
     *
     * @param eventHandler the event handler
     * @return the attribute section
     */

    static Attribute onsubmit(EventHandler<OnSubmit> eventHandler) {
        return onAttribute("onsubmit", OnSubmit.class, eventHandler);
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
    static <E extends Event> Attribute onAttribute(String event, Class<E> eventType, EventHandler<E> eventHandler) {
        return new EventAwareAttribute(event, eventType, eventHandler);
    }

    /**
     * Accept attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute accept(String value) {
        return attr("href", value);
    }

    /**
     * Accept charset attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute accept_charset(String value) {
        return attr("accept-charset", value);
    }

    /**
     * Accesskey attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute accesskey(String value) {
        return attr("accesskey", value);
    }

    /**
     * Action attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute action(String value) {
        return attr("action", value);
    }

    /**
     * Align attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute align(String value) {
        return attr("align", value);
    }

    /**
     * Allow attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute allow(String value) {
        return attr("allow", value);
    }

    /**
     * Alt attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute alt(String value) {
        return attr("alt", value);
    }

    /**
     * Async attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute async(String value) {
        return attr("async", value);
    }

    /**
     * Autocapitalize attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute autocapitalize(String value) {
        return attr("autocapitalize", value);
    }

    /**
     * Autocomplete attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute autocomplete(String value) {
        return attr("autocomplete", value);
    }

    /**
     * Autofocus attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute autofocus(String value) {
        return attr("autofocus", value);
    }

    /**
     * Autoplay attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute autoplay(String value) {
        return attr("autoplay", value);
    }

    /**
     * Background attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute background(String value) {
        return attr("background", value);
    }

    /**
     * Bgcolor attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute bgcolor(String value) {
        return attr("bgcolor", value);
    }

    /**
     * Border attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute border(String value) {
        return attr("border", value);
    }

    /**
     * Buffered attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute buffered(String value) {
        return attr("buffered", value);
    }

    /**
     * Capture attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute capture(String value) {
        return attr("capture", value);
    }

    /**
     * Challenge attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute challenge(String value) {
        return attr("challenge", value);
    }

    /**
     * Charset attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute charset(String value) {
        return attr("charset", value);
    }

    /**
     * Checked attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute checked(String value) {
        return attr("checked", value);
    }

    /**
     * Cite attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute cite(String value) {
        return attr("cite", value);
    }

    /**
     * Class name attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute className(String value) {
        return attr("class", value);
    }

    /**
     * Clazz attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute clazz(String value) {
        return attr("class", value);
    }

    /**
     * Classs attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute classs(String value) {
        return attr("class", value);
    }

    /**
     * Code attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute code(String value) {
        return attr("code", value);
    }

    /**
     * Codebase attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute codebase(String value) {
        return attr("codebase", value);
    }

    /**
     * Color attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute color(String value) {
        return attr("color", value);
    }

    /**
     * Cols attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute cols(String value) {
        return attr("cols", value);
    }

    /**
     * Colspan attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute colspan(String value) {
        return attr("colspan", value);
    }

    /**
     * Content attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute content(String value) {
        return attr("content", value);
    }

    /**
     * Contenteditable attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute contenteditable(String value) {
        return attr("contenteditable", value);
    }

    /**
     * Contextmenu attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute contextmenu(String value) {
        return attr("contextmenu", value);
    }

    /**
     * Controls attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute controls(String value) {
        return attr("controls", value);
    }

    /**
     * Coords attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute coords(String value) {
        return attr("coords", value);
    }

    /**
     * Crossorigin attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute crossorigin(String value) {
        return attr("crossorigin", value);
    }

    /**
     * Csp attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute csp(String value) {
        return attr("csp", value);
    }

    /**
     * Data attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute data(String value) {
        return attr("data", value);
    }

    /**
     * Data attribute section.
     *
     * @param key   the key
     * @param value the value
     * @return the attribute section
     */
    static Attribute data_(String key, String value) {
        return attr("data-" + key, value);
    }

    /**
     * Datetime attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute datetime(String value) {
        return attr("datetime", value);
    }

    /**
     * Decoding attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute decoding(String value) {
        return attr("decoding", value);
    }

    /**
     * Dfault attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute dfault(String value) {
        return attr("default", value);
    }

    /**
     * Defaultt attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute defaultt(String value) {
        return attr("default", value);
    }

    /**
     * Defer attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute defer(String value) {
        return attr("defer", value);
    }

    /**
     * Dir attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute dir(String value) {
        return attr("dir", value);
    }

    /**
     * Dirname attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute dirname(String value) {
        return attr("dirname", value);
    }

    /**
     * Disabled attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute disabled(String value) {
        return attr("disabled", value);
    }

    /**
     * Download attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute download(String value) {
        return attr("download", value);
    }

    /**
     * Draggable attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute draggable(String value) {
        return attr("draggable", value);
    }

    /**
     * Enctype attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute enctype(String value) {
        return attr("enctype", value);
    }

    /**
     * Enterkeyhint attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute enterkeyhint(String value) {
        return attr("enterkeyhint", value);
    }

    /**
     * For attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute htmlFor(String value) {
        return attr("for", value);
    }

    /**
     * Form attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute form(String value) {
        return attr("form", value);
    }

    /**
     * Formaction attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute formaction(String value) {
        return attr("formaction", value);
    }

    /**
     * Formenctype attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute formenctype(String value) {
        return attr("formenctype", value);
    }

    /**
     * Formmethod attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute formmethod(String value) {
        return attr("formmethod", value);
    }

    /**
     * Formnovalidate attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute formnovalidate(String value) {
        return attr("formnovalidate", value);
    }

    /**
     * Formtarget attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute formtarget(String value) {
        return attr("formtarget", value);
    }

    /**
     * Headers attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute headers(String value) {
        return attr("headers", value);
    }

    /**
     * Height attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute height(String value) {
        return attr("height", value);
    }

    /**
     * Hidden attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute hidden(String value) {
        return attr("hidden", value);
    }

    /**
     * High attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute high(String value) {
        return attr("high", value);
    }

    /**
     * Href attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute href(String value) {
        return attr("href", value);
    }

    /**
     * Hreflang attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute hreflang(String value) {
        return attr("hreflang", value);
    }

    /**
     * Http equiv attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute http_equiv(String value) {
        return attr("http-equiv", value);
    }

    /**
     * Icon attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute icon(String value) {
        return attr("icon", value);
    }

    /**
     * Id attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute id(String value) {
        return attr("id", value);
    }

    /**
     * Importance attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute importance(String value) {
        return attr("importance", value);
    }

    /**
     * Integrity attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute integrity(String value) {
        return attr("integrity", value);
    }

    /**
     * Intrinsicsize attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute intrinsicsize(String value) {
        return attr("intrinsicsize", value);
    }

    /**
     * Inputmode attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute inputmode(String value) {
        return attr("inputmode", value);
    }

    /**
     * Ismap attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute ismap(String value) {
        return attr("ismap", value);
    }

    /**
     * Itemprop attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute itemprop(String value) {
        return attr("itemprop", value);
    }

    /**
     * Keytype attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute keytype(String value) {
        return attr("keytype", value);
    }

    /**
     * Kind attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute kind(String value) {
        return attr("kind", value);
    }

    /**
     * Label attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute label(String value) {
        return attr("label", value);
    }

    /**
     * Lang attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute lang(String value) {
        return attr("lang", value);
    }

    /**
     * Language attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute language(String value) {
        return attr("language", value);
    }

    /**
     * Loading attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute loading(String value) {
        return attr("loading", value);
    }

    /**
     * List attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute list(String value) {
        return attr("list", value);
    }

    /**
     * Loop attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute loop(String value) {
        return attr("loop", value);
    }

    /**
     * Low attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute low(String value) {
        return attr("low", value);
    }

    /**
     * Manifest attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute manifest(String value) {
        return attr("manifest", value);
    }

    /**
     * Max attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute max(String value) {
        return attr("max", value);
    }

    /**
     * Maxlength attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute maxlength(String value) {
        return attr("maxlength", value);
    }

    /**
     * Minlength attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute minlength(String value) {
        return attr("minlength", value);
    }

    /**
     * Media attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute media(String value) {
        return attr("media", value);
    }

    /**
     * Method attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute method(String value) {
        return attr("method", value);
    }

    /**
     * Min attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute min(String value) {
        return attr("min", value);
    }

    /**
     * Multiple attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute multiple(String value) {
        return attr("multiple", value);
    }

    /**
     * Muted attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute muted(String value) {
        return attr("muted", value);
    }

    /**
     * Name attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute name(String value) {
        return attr("name", value);
    }

    /**
     * Novalidate attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute novalidate(String value) {
        return attr("novalidate", value);
    }

    /**
     * Open attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute open(String value) {
        return attr("open", value);
    }

    /**
     * Optimum attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute optimum(String value) {
        return attr("optimum", value);
    }

    /**
     * Pattern attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute pattern(String value) {
        return attr("pattern", value);
    }

    /**
     * Ping attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute ping(String value) {
        return attr("ping", value);
    }

    /**
     * Placeholder attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute placeholder(String value) {
        return attr("placeholder", value);
    }

    /**
     * Poster attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute poster(String value) {
        return attr("poster", value);
    }

    /**
     * Preload attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute preload(String value) {
        return attr("preload", value);
    }

    /**
     * Radiogroup attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute radiogroup(String value) {
        return attr("radiogroup", value);
    }

    /**
     * Readonly attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute readonly(String value) {
        return attr("readonly", value);
    }

    /**
     * Referrerpolicy attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute referrerpolicy(String value) {
        return attr("referrerpolicy", value);
    }

    /**
     * Rel attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute rel(String value) {
        return attr("rel", value);
    }

    /**
     * Required attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute required(String value) {
        return attr("required", value);
    }

    /**
     * Reversed attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute reversed(String value) {
        return attr("reversed", value);
    }

    /**
     * Rows attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute rows(String value) {
        return attr("rows", value);
    }

    /**
     * Rowspan attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute rowspan(String value) {
        return attr("rowspan", value);
    }

    /**
     * Sandbox attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute sandbox(String value) {
        return attr("sandbox", value);
    }

    /**
     * Scope attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute scope(String value) {
        return attr("scope", value);
    }

    /**
     * Scoped attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute scoped(String value) {
        return attr("scoped", value);
    }

    /**
     * Selected attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute selected(String value) {
        return attr("selected", value);
    }

    /**
     * Shape attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute shape(String value) {
        return attr("shape", value);
    }

    /**
     * Size attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute size(String value) {
        return attr("size", value);
    }

    /**
     * Sizes attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute sizes(String value) {
        return attr("sizes", value);
    }

    /**
     * Slot attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute slot(String value) {
        return attr("slot", value);
    }

    /**
     * Span attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute span(String value) {
        return attr("span", value);
    }

    /**
     * Spellcheck attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute spellcheck(String value) {
        return attr("spellcheck", value);
    }

    /**
     * Src attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute src(String value) {
        return attr("src", value);
    }

    /**
     * Srcdoc attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute srcdoc(String value) {
        return attr("srcdoc", value);
    }

    /**
     * Srclang attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute srclang(String value) {
        return attr("srclang", value);
    }

    /**
     * Srcset attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute srcset(String value) {
        return attr("srcset", value);
    }

    /**
     * Start attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute start(String value) {
        return attr("start", value);
    }

    /**
     * Step attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute step(String value) {
        return attr("step", value);
    }

    /**
     * Style attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute style(String value) {
        return attr("style", value);
    }

    /**
     * Summary attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute summary(String value) {
        return attr("summary", value);
    }

    /**
     * Tabindex attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute tabindex(String value) {
        return attr("tabindex", value);
    }

    /**
     * Target attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute target(String value) {
        return attr("target", value);
    }

    /**
     * Title attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute title(String value) {
        return attr("title", value);
    }

    /**
     * Translate attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute translate(String value) {
        return attr("translate", value);
    }

    /**
     * Type attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute type(String value) {
        return attr("type", value);
    }

    /**
     * Usemap attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute usemap(String value) {
        return attr("usemap", value);
    }

    /**
     * Value attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute value(String value) {
        return attr("value", value);
    }

    /**
     * Width attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute width(String value) {
        return attr("width", value);
    }

    /**
     * Wrap attribute section.
     *
     * @param value the value
     * @return the attribute section
     */
    static Attribute wrap(String value) {
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
    static Element tag(String name, Section... children) {
        return new Element(name, children);
    }

    // Main root

    /**
     * Html element.
     *
     * @param children the children
     * @return the element
     */
    static Element html(Section... children) {
        return new HtmlElement(children);
    }

    // Document metadata

    /**
     * Base element.
     *
     * @param children the children
     * @return the element
     */
    static Element base(Section... children) {
        return tag("base", children);
    }

    /**
     * Head element.
     *
     * @param children the children
     * @return the element
     */
    static Element head(Section... children) {
        return tag("head", children);
    }

    /**
     * Link element.
     *
     * @param children the children
     * @return the element
     */
    static Element link(Section... children) {
        return tag("link", children);
    }

    /**
     * Meta element.
     *
     * @param children the children
     * @return the element
     */
    static Element meta(Section... children) {
        return tag("meta", children);
    }

    /**
     * Style element.
     *
     * @param children the children
     * @return the element
     */
    static Element style(Section... children) {
        return tag("style", children);
    }

    /**
     * Title element.
     *
     * @param children the children
     * @return the element
     */
    static Element title(Section... children) {
        return tag("title", children);
    }

    // Sectioning root

    /**
     * Body element.
     *
     * @param children the children
     * @return the element
     */
    static Element body(Section... children) {
        return tag("body", children);
    }

    // Content sectioning


    /**
     * Address element.
     *
     * @param children the children
     * @return the element
     */
    static Element address(Section... children) {
        return tag("address", children);
    }

    /**
     * Article element.
     *
     * @param children the children
     * @return the element
     */
    static Element article(Section... children) {
        return tag("article", children);
    }

    /**
     * Aside element.
     *
     * @param children the children
     * @return the element
     */
    static Element aside(Section... children) {
        return tag("aside", children);
    }

    /**
     * Footer element.
     *
     * @param children the children
     * @return the element
     */
    static Element footer(Section... children) {
        return tag("footer", children);
    }

    /**
     * Header element.
     *
     * @param children the children
     * @return the element
     */
    static Element header(Section... children) {
        return tag("header", children);
    }

    /**
     * H 1 element.
     *
     * @param children the children
     * @return the element
     */
    static Element h1(Section... children) {
        return tag("h1", children);
    }

    /**
     * H 2 element.
     *
     * @param children the children
     * @return the element
     */
    static Element h2(Section... children) {
        return tag("h2", children);
    }

    /**
     * H 3 element.
     *
     * @param children the children
     * @return the element
     */
    static Element h3(Section... children) {
        return tag("h3", children);
    }

    /**
     * H 4 element.
     *
     * @param children the children
     * @return the element
     */
    static Element h4(Section... children) {
        return tag("h4", children);
    }

    /**
     * H 5 element.
     *
     * @param children the children
     * @return the element
     */
    static Element h5(Section... children) {
        return tag("h5", children);
    }

    /**
     * H 6 element.
     *
     * @param children the children
     * @return the element
     */
    static Element h6(Section... children) {
        return tag("h6", children);
    }

    /**
     * Main element.
     *
     * @param children the children
     * @return the element
     */
    static Element main(Section... children) {
        return tag("main", children);
    }

    /**
     * Nav element.
     *
     * @param children the children
     * @return the element
     */
    static Element nav(Section... children) {
        return tag("nav", children);
    }

    /**
     * Section element.
     *
     * @param children the children
     * @return the element
     */
    static Element section(Section... children) {
        return tag("section", children);
    }

    // Text content

    /**
     * Blockquote element.
     *
     * @param children the children
     * @return the element
     */
    static Element blockquote(Section... children) {
        return tag("blockquote", children);
    }

    /**
     * Dd element.
     *
     * @param children the children
     * @return the element
     */
    static Element dd(Section... children) {
        return tag("dd", children);
    }

    /**
     * Div element.
     *
     * @param children the children
     * @return the element
     */
    static Element div(Section... children) {
        return tag("div", children);
    }

    /**
     * Dl element.
     *
     * @param children the children
     * @return the element
     */
    static Element dl(Section... children) {
        return tag("dl", children);
    }

    /**
     * Dt element.
     *
     * @param children the children
     * @return the element
     */
    static Element dt(Section... children) {
        return tag("dt", children);
    }

    /**
     * Figcaption element.
     *
     * @param children the children
     * @return the element
     */
    static Element figcaption(Section... children) {
        return tag("figcaption", children);
    }

    /**
     * Figure element.
     *
     * @param children the children
     * @return the element
     */
    static Element figure(Section... children) {
        return tag("figure", children);
    }

    /**
     * Hr element.
     *
     * @param children the children
     * @return the element
     */
    static Element hr(Section... children) {
        return tag("hr", children);
    }

    /**
     * Li element.
     *
     * @param children the children
     * @return the element
     */
    static Element li(Section... children) {
        return tag("li", children);
    }

    /**
     * Ol element.
     *
     * @param children the children
     * @return the element
     */
    static Element ol(Section... children) {
        return tag("ol", children);
    }

    /**
     * P element.
     *
     * @param children the children
     * @return the element
     */
    static Element p(Section... children) {
        return tag("p", children);
    }

    /**
     * Pre element.
     *
     * @param children the children
     * @return the element
     */
    static Element pre(Section... children) {
        return tag("pre", children);
    }

    /**
     * Ul element.
     *
     * @param children the children
     * @return the element
     */
    static Element ul(Section... children) {
        return tag("ul", children);
    }

    // Inline text semantics

    /**
     * A element.
     *
     * @param children the children
     * @return the element
     */
    static Element a(Section... children) {
        return tag("a", children);
    }

    /**
     * Abbr element.
     *
     * @param children the children
     * @return the element
     */
    static Element abbr(Section... children) {
        return tag("abbr", children);
    }

    /**
     * B element.
     *
     * @param children the children
     * @return the element
     */
    static Element b(Section... children) {
        return tag("b", children);
    }

    /**
     * Bdi element.
     *
     * @param children the children
     * @return the element
     */
    static Element bdi(Section... children) {
        return tag("bdi", children);
    }

    /**
     * Bdo element.
     *
     * @param children the children
     * @return the element
     */
    static Element bdo(Section... children) {
        return tag("bdo", children);
    }

    /**
     * Br element.
     *
     * @param children the children
     * @return the element
     */
    static Element br(Section... children) {
        return tag("br", children);
    }

    /**
     * Cite element.
     *
     * @param children the children
     * @return the element
     */
    static Element cite(Section... children) {
        return tag("cite", children);
    }

    /**
     * Code element.
     *
     * @param children the children
     * @return the element
     */
    static Element code(Section... children) {
        return tag("code", children);
    }

    /**
     * Data element.
     *
     * @param children the children
     * @return the element
     */
    static Element data(Section... children) {
        return tag("data", children);
    }

    /**
     * Dfn element.
     *
     * @param children the children
     * @return the element
     */
    static Element dfn(Section... children) {
        return tag("dfn", children);
    }

    /**
     * Em element.
     *
     * @param children the children
     * @return the element
     */
    static Element em(Section... children) {
        return tag("em", children);
    }

    /**
     * element.
     *
     * @param children the children
     * @return the element
     */
    static Element i(Section... children) {
        return tag("i", children);
    }

    /**
     * Kbd element.
     *
     * @param children the children
     * @return the element
     */
    static Element kbd(Section... children) {
        return tag("kbd", children);
    }

    /**
     * Mark element.
     *
     * @param children the children
     * @return the element
     */
    static Element mark(Section... children) {
        return tag("mark", children);
    }

    /**
     * Q element.
     *
     * @param children the children
     * @return the element
     */
    static Element q(Section... children) {
        return tag("q", children);
    }

    /**
     * Rp element.
     *
     * @param children the children
     * @return the element
     */
    static Element rp(Section... children) {
        return tag("rp", children);
    }

    /**
     * Rt element.
     *
     * @param children the children
     * @return the element
     */
    static Element rt(Section... children) {
        return tag("rt", children);
    }

    /**
     * Ruby element.
     *
     * @param children the children
     * @return the element
     */
    static Element ruby(Section... children) {
        return tag("ruby", children);
    }

    /**
     * S element.
     *
     * @param children the children
     * @return the element
     */
    static Element s(Section... children) {
        return tag("s", children);
    }

    /**
     * Samp element.
     *
     * @param children the children
     * @return the element
     */
    static Element samp(Section... children) {
        return tag("samp", children);
    }

    /**
     * Small element.
     *
     * @param children the children
     * @return the element
     */
    static Element small(Section... children) {
        return tag("small", children);
    }

    /**
     * Span element.
     *
     * @param children the children
     * @return the element
     */
    static Element span(Section... children) {
        return tag("span", children);
    }

    /**
     * Strong element.
     *
     * @param children the children
     * @return the element
     */
    static Element strong(Section... children) {
        return tag("strong", children);
    }

    /**
     * Sub element.
     *
     * @param children the children
     * @return the element
     */
    static Element sub(Section... children) {
        return tag("sub", children);
    }

    /**
     * Sup element.
     *
     * @param children the children
     * @return the element
     */
    static Element sup(Section... children) {
        return tag("sup", children);
    }

    /**
     * Time element.
     *
     * @param children the children
     * @return the element
     */
    static Element time(Section... children) {
        return tag("time", children);
    }

    /**
     * U element.
     *
     * @param children the children
     * @return the element
     */
    static Element u(Section... children) {
        return tag("u", children);
    }

    /**
     * Var element.
     *
     * @param children the children
     * @return the element
     */
    static Element var(Section... children) {
        return tag("var", children);
    }

    /**
     * Wbr element.
     *
     * @param children the children
     * @return the element
     */
    static Element wbr(Section... children) {
        return tag("wbr", children);
    }

    // Image and multimedia

    /**
     * Area element.
     *
     * @param children the children
     * @return the element
     */
    static Element area(Section... children) {
        return tag("area", children);
    }

    /**
     * Audio element.
     *
     * @param children the children
     * @return the element
     */
    static Element audio(Section... children) {
        return tag("audio", children);
    }

    /**
     * Img element.
     *
     * @param children the children
     * @return the element
     */
    static Element img(Section... children) {
        return tag("img", children);
    }

    /**
     * Map element.
     *
     * @param children the children
     * @return the element
     */
    static Element map(Section... children) {
        return tag("map", children);
    }

    /**
     * Track element.
     *
     * @param children the children
     * @return the element
     */
    static Element track(Section... children) {
        return tag("track", children);
    }

    /**
     * Video element.
     *
     * @param children the children
     * @return the element
     */
    static Element video(Section... children) {
        return tag("video", children);
    }

    // Embedded content

    /**
     * Embed element.
     *
     * @param children the children
     * @return the element
     */
    static Element embed(Section... children) {
        return tag("embed", children);
    }

    /**
     * Iframe element.
     *
     * @param children the children
     * @return the element
     */
    static Element iframe(Section... children) {
        return tag("iframe", children);
    }

    /**
     * Object element.
     *
     * @param children the children
     * @return the element
     */
    static Element object(Section... children) {
        return tag("objcet", children);
    }

    /**
     * Param element.
     *
     * @param children the children
     * @return the element
     */
    static Element param(Section... children) {
        return tag("param", children);
    }

    /**
     * Picture element.
     *
     * @param children the children
     * @return the element
     */
    static Element picture(Section... children) {
        return tag("picture", children);
    }

    /**
     * Portal element.
     *
     * @param children the children
     * @return the element
     */
    static Element portal(Section... children) {
        return tag("portal", children);
    }

    /**
     * Source element.
     *
     * @param children the children
     * @return the element
     */
    static Element source(Section... children) {
        return tag("source", children);
    }

    // SVG and MathML

    /**
     * Svg element.
     *
     * @param children the children
     * @return the element
     */
    static Element svg(Section... children) {
        return tag("svg", children);
    }

    /**
     * Math element.
     *
     * @param children the children
     * @return the element
     */
    static Element math(Section... children) {
        return tag("math", children);
    }

    // Scripting

    /**
     * Canvas element.
     *
     * @param children the children
     * @return the element
     */
    static Element canvas(Section... children) {
        return tag("canvas", children);
    }

    /**
     * Noscript element.
     *
     * @param children the children
     * @return the element
     */
    static Element noscript(Section... children) {
        return tag("noscript", children);
    }

    /**
     * Script element.
     *
     * @param children the children
     * @return the element
     */
    static Element script(Section... children) {
        return tag("script", children);
    }

    // Demarcating edits

    /**
     * Del element.
     *
     * @param children the children
     * @return the element
     */
    static Element del(Section... children) {
        return tag("del", children);
    }

    /**
     * Ins element.
     *
     * @param children the children
     * @return the element
     */
    static Element ins(Section... children) {
        return tag("ins", children);
    }

    // Table content

    /**
     * Caption element.
     *
     * @param children the children
     * @return the element
     */
    static Element caption(Section... children) {
        return tag("caption", children);
    }

    /**
     * Col element.
     *
     * @param children the children
     * @return the element
     */
    static Element col(Section... children) {
        return tag("col", children);
    }

    /**
     * Colgroup element.
     *
     * @param children the children
     * @return the element
     */
    static Element colgroup(Section... children) {
        return tag("colgroup", children);
    }

    /**
     * Table element.
     *
     * @param children the children
     * @return the element
     */
    static Element table(Section... children) {
        return tag("table", children);
    }

    /**
     * Tbody element.
     *
     * @param children the children
     * @return the element
     */
    static Element tbody(Section... children) {
        return tag("tbody", children);
    }

    /**
     * Td element.
     *
     * @param children the children
     * @return the element
     */
    static Element td(Section... children) {
        return tag("td", children);
    }

    /**
     * Tfoot element.
     *
     * @param children the children
     * @return the element
     */
    static Element tfoot(Section... children) {
        return tag("tfoot", children);
    }

    /**
     * Th element.
     *
     * @param children the children
     * @return the element
     */
    static Element th(Section... children) {
        return tag("th", children);
    }

    /**
     * Thead element.
     *
     * @param children the children
     * @return the element
     */
    static Element thead(Section... children) {
        return tag("thead", children);
    }

    /**
     * Tr element.
     *
     * @param children the children
     * @return the element
     */
    static Element tr(Section... children) {
        return tag("tr", children);
    }

    // Forms

    /**
     * Button element.
     *
     * @param children the children
     * @return the element
     */
    static Element button(Section... children) {
        return tag("button", children);
    }

    /**
     * Datalist element.
     *
     * @param children the children
     * @return the element
     */
    static Element datalist(Section... children) {
        return tag("datalist", children);
    }

    /**
     * Fieldset element.
     *
     * @param children the children
     * @return the element
     */
    static Element fieldset(Section... children) {
        return tag("fieldset", children);
    }

    /**
     * Form element.
     *
     * @param children the children
     * @return the element
     */
    static Element form(Section... children) {
        return tag("form", children);
    }

    /**
     * Input element.
     *
     * @param children the children
     * @return the element
     */
    static Element input(Section... children) {
        return tag("input", children);
    }

    /**
     * Label element.
     *
     * @param children the children
     * @return the element
     */
    static Element label(Section... children) {
        return tag("label", children);
    }

    /**
     * Legend element.
     *
     * @param children the children
     * @return the element
     */
    static Element legend(Section... children) {
        return tag("legend", children);
    }

    /**
     * Meter element.
     *
     * @param children the children
     * @return the element
     */
    static Element meter(Section... children) {
        return tag("meter", children);
    }

    /**
     * Optgroup element.
     *
     * @param children the children
     * @return the element
     */
    static Element optgroup(Section... children) {
        return tag("optgroup", children);
    }

    /**
     * Option element.
     *
     * @param children the children
     * @return the element
     */
    static Element option(Section... children) {
        return tag("option", children);
    }

    /**
     * Output element.
     *
     * @param children the children
     * @return the element
     */
    static Element output(Section... children) {
        return tag("output", children);
    }

    /**
     * Progress element.
     *
     * @param children the children
     * @return the element
     */
    static Element progress(Section... children) {
        return tag("progress", children);
    }

    /**
     * Select element.
     *
     * @param children the children
     * @return the element
     */
    static Element select(Section... children) {
        return tag("select", children);
    }

    /**
     * Textarea element.
     *
     * @param children the children
     * @return the element
     */
    static Element textarea(Section... children) {
        return tag("textarea", children);
    }

    // Interactive elements

    /**
     * Details element.
     *
     * @param children the children
     * @return the element
     */
    static Element details(Section... children) {
        return tag("details", children);
    }

    /**
     * Dialog element.
     *
     * @param children the children
     * @return the element
     */
    static Element dialog(Section... children) {
        return tag("dialog", children);
    }

    /**
     * Menu element.
     *
     * @param children the children
     * @return the element
     */
    static Element menu(Section... children) {
        return tag("menu", children);
    }

    /**
     * Summary element.
     *
     * @param children the children
     * @return the element
     */
    static Element summary(Section... children) {
        return tag("summary", children);
    }

    /**
     * Slot element.
     *
     * @param children the children
     * @return the element
     */
    static Element slot(Section... children) {
        return tag("slot", children);
    }

    /**
     * Template element.
     *
     * @param children the children
     * @return the element
     */
    static Element template(Section... children) {
        return tag("template", children);
    }
}
