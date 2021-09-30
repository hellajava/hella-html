package sh.hella.html;

import sh.hella.html.element.Attribute;
import sh.hella.html.element.CompositeElement;
import sh.hella.html.element.HtmlDocumentElement;
import sh.hella.html.element.JavaScriptElement;
import sh.hella.html.element.Element;
import sh.hella.html.element.TextElement;

/**
 * The interface Html.
 */
@SuppressWarnings("unused")
public interface Html {

    /**
     * An element that represents a composite group of elements.
     * @param elements The elements
     * @return The composite element
     */
    static Element elements(Element... elements) {
        return new CompositeElement(elements);
    }

    /**
     * Text element.
     *
     * @param text the text
     * @return the element
     */
    static Element text(String text) {
        return new TextElement(text);
    }

    /**
     * Onclick element.
     *
     * @param javaScriptElement The javascript element
     * @return the attribute element
     */
    static Attribute onclick(JavaScriptElement javaScriptElement) {
        return new Attribute("onclick", javaScriptElement.toString());
    }

    // Attributes

    /**
     * Attr attribute element.
     *
     * @param key   the key
     * @param value the value
     * @return the attribute element
     */
    static Attribute attr(String key, String value) {
        return new Attribute(key, value);
    }

    /**
     * Accept attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute accept(String value) {
        return attr("href", value);
    }

    /**
     * Accept charset attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute accept_charset(String value) {
        return attr("accept-charset", value);
    }

    /**
     * Accesskey attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute accesskey(String value) {
        return attr("accesskey", value);
    }

    /**
     * Action attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute action(String value) {
        return attr("action", value);
    }

    /**
     * Align attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute align(String value) {
        return attr("align", value);
    }

    /**
     * Allow attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute allow(String value) {
        return attr("allow", value);
    }

    /**
     * Alt attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute alt(String value) {
        return attr("alt", value);
    }

    /**
     * Async attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute async(String value) {
        return attr("async", value);
    }

    /**
     * Autocapitalize attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute autocapitalize(String value) {
        return attr("autocapitalize", value);
    }

    /**
     * Autocomplete attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute autocomplete(String value) {
        return attr("autocomplete", value);
    }

    /**
     * Autofocus attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute autofocus(String value) {
        return attr("autofocus", value);
    }

    /**
     * Autoplay attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute autoplay(String value) {
        return attr("autoplay", value);
    }

    /**
     * Background attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute background(String value) {
        return attr("background", value);
    }

    /**
     * Bgcolor attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute bgcolor(String value) {
        return attr("bgcolor", value);
    }

    /**
     * Border attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute border(String value) {
        return attr("border", value);
    }

    /**
     * Buffered attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute buffered(String value) {
        return attr("buffered", value);
    }

    /**
     * Capture attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute capture(String value) {
        return attr("capture", value);
    }

    /**
     * Challenge attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute challenge(String value) {
        return attr("challenge", value);
    }

    /**
     * Charset attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute charset(String value) {
        return attr("charset", value);
    }

    /**
     * Checked attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute checked(String value) {
        return attr("checked", value);
    }

    /**
     * Cite attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute cite(String value) {
        return attr("cite", value);
    }

    /**
     * Clazz attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute clazz(String value) {
        return attr("class", value);
    }

    /**
     * Classs attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute classs(String value) {
        return attr("class", value);
    }

    /**
     * Code attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute code(String value) {
        return attr("code", value);
    }

    /**
     * Codebase attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute codebase(String value) {
        return attr("codebase", value);
    }

    /**
     * Color attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute color(String value) {
        return attr("color", value);
    }

    /**
     * Cols attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute cols(String value) {
        return attr("cols", value);
    }

    /**
     * Colspan attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute colspan(String value) {
        return attr("colspan", value);
    }

    /**
     * Content attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute content(String value) {
        return attr("content", value);
    }

    /**
     * Contenteditable attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute contenteditable(String value) {
        return attr("contenteditable", value);
    }

    /**
     * Contextmenu attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute contextmenu(String value) {
        return attr("contextmenu", value);
    }

    /**
     * Controls attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute controls(String value) {
        return attr("controls", value);
    }

    /**
     * Coords attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute coords(String value) {
        return attr("coords", value);
    }

    /**
     * Crossorigin attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute crossorigin(String value) {
        return attr("crossorigin", value);
    }

    /**
     * Csp attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute csp(String value) {
        return attr("csp", value);
    }

    /**
     * Data attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute data(String value) {
        return attr("data", value);
    }

    /**
     * Data attribute element.
     *
     * @param key   the key
     * @param value the value
     * @return the attribute element
     */
    static Attribute data_(String key, String value) {
        return attr("data-" + key, value);
    }

    /**
     * Datetime attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute datetime(String value) {
        return attr("datetime", value);
    }

    /**
     * Decoding attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute decoding(String value) {
        return attr("decoding", value);
    }

    /**
     * Dfault attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute dfault(String value) {
        return attr("default", value);
    }

    /**
     * Defaultt attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute defaultt(String value) {
        return attr("default", value);
    }

    /**
     * Defer attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute defer(String value) {
        return attr("defer", value);
    }

    /**
     * Dir attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute dir(String value) {
        return attr("dir", value);
    }

    /**
     * Dirname attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute dirname(String value) {
        return attr("dirname", value);
    }

    /**
     * Disabled attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute disabled(String value) {
        return attr("disabled", value);
    }

    /**
     * Download attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute download(String value) {
        return attr("download", value);
    }

    /**
     * Draggable attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute draggable(String value) {
        return attr("draggable", value);
    }

    /**
     * Enctype attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute enctype(String value) {
        return attr("enctype", value);
    }

    /**
     * Enterkeyhint attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute enterkeyhint(String value) {
        return attr("enterkeyhint", value);
    }

    /**
     * Forr attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute forr(String value) {
        return attr("for", value);
    }

    /**
     * Form attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute form(String value) {
        return attr("form", value);
    }

    /**
     * Formaction attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute formaction(String value) {
        return attr("formaction", value);
    }

    /**
     * Formenctype attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute formenctype(String value) {
        return attr("formenctype", value);
    }

    /**
     * Formmethod attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute formmethod(String value) {
        return attr("formmethod", value);
    }

    /**
     * Formnovalidate attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute formnovalidate(String value) {
        return attr("formnovalidate", value);
    }

    /**
     * Formtarget attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute formtarget(String value) {
        return attr("formtarget", value);
    }

    /**
     * Headers attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute headers(String value) {
        return attr("headers", value);
    }

    /**
     * Height attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute height(String value) {
        return attr("height", value);
    }

    /**
     * Hidden attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute hidden(String value) {
        return attr("hidden", value);
    }

    /**
     * High attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute high(String value) {
        return attr("high", value);
    }

    /**
     * Href attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute href(String value) {
        return attr("href", value);
    }

    /**
     * Hreflang attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute hreflang(String value) {
        return attr("hreflang", value);
    }

    /**
     * Http equiv attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute http_equiv(String value) {
        return attr("http-equiv", value);
    }

    /**
     * Icon attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute icon(String value) {
        return attr("icon", value);
    }

    /**
     * Id attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute id(String value) {
        return attr("id", value);
    }

    /**
     * Importance attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute importance(String value) {
        return attr("importance", value);
    }

    /**
     * Integrity attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute integrity(String value) {
        return attr("integrity", value);
    }

    /**
     * Intrinsicsize attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute intrinsicsize(String value) {
        return attr("intrinsicsize", value);
    }

    /**
     * Inputmode attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute inputmode(String value) {
        return attr("inputmode", value);
    }

    /**
     * Ismap attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute ismap(String value) {
        return attr("ismap", value);
    }

    /**
     * Itemprop attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute itemprop(String value) {
        return attr("itemprop", value);
    }

    /**
     * Keytype attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute keytype(String value) {
        return attr("keytype", value);
    }

    /**
     * Kind attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute kind(String value) {
        return attr("kind", value);
    }

    /**
     * Label attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute label(String value) {
        return attr("label", value);
    }

    /**
     * Lang attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute lang(String value) {
        return attr("lang", value);
    }

    /**
     * Language attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute language(String value) {
        return attr("language", value);
    }

    /**
     * Loading attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute loading(String value) {
        return attr("loading", value);
    }

    /**
     * List attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute list(String value) {
        return attr("list", value);
    }

    /**
     * Loop attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute loop(String value) {
        return attr("loop", value);
    }

    /**
     * Low attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute low(String value) {
        return attr("low", value);
    }

    /**
     * Manifest attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute manifest(String value) {
        return attr("manifest", value);
    }

    /**
     * Max attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute max(String value) {
        return attr("max", value);
    }

    /**
     * Maxlength attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute maxlength(String value) {
        return attr("maxlength", value);
    }

    /**
     * Minlength attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute minlength(String value) {
        return attr("minlength", value);
    }

    /**
     * Media attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute media(String value) {
        return attr("media", value);
    }

    /**
     * Method attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute method(String value) {
        return attr("method", value);
    }

    /**
     * Min attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute min(String value) {
        return attr("min", value);
    }

    /**
     * Multiple attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute multiple(String value) {
        return attr("multiple", value);
    }

    /**
     * Muted attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute muted(String value) {
        return attr("muted", value);
    }

    /**
     * Name attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute name(String value) {
        return attr("name", value);
    }

    /**
     * Novalidate attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute novalidate(String value) {
        return attr("novalidate", value);
    }

    /**
     * Open attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute open(String value) {
        return attr("open", value);
    }

    /**
     * Optimum attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute optimum(String value) {
        return attr("optimum", value);
    }

    /**
     * Pattern attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute pattern(String value) {
        return attr("pattern", value);
    }

    /**
     * Ping attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute ping(String value) {
        return attr("ping", value);
    }

    /**
     * Placeholder attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute placeholder(String value) {
        return attr("placeholder", value);
    }

    /**
     * Poster attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute poster(String value) {
        return attr("poster", value);
    }

    /**
     * Preload attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute preload(String value) {
        return attr("preload", value);
    }

    /**
     * Radiogroup attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute radiogroup(String value) {
        return attr("radiogroup", value);
    }

    /**
     * Readonly attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute readonly(String value) {
        return attr("readonly", value);
    }

    /**
     * Referrerpolicy attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute referrerpolicy(String value) {
        return attr("referrerpolicy", value);
    }

    /**
     * Rel attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute rel(String value) {
        return attr("rel", value);
    }

    /**
     * Required attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute required(String value) {
        return attr("required", value);
    }

    /**
     * Reversed attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute reversed(String value) {
        return attr("reversed", value);
    }

    /**
     * Rows attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute rows(String value) {
        return attr("rows", value);
    }

    /**
     * Rowspan attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute rowspan(String value) {
        return attr("rowspan", value);
    }

    /**
     * Sandbox attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute sandbox(String value) {
        return attr("sandbox", value);
    }

    /**
     * Scope attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute scope(String value) {
        return attr("scope", value);
    }

    /**
     * Scoped attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute scoped(String value) {
        return attr("scoped", value);
    }

    /**
     * Selected attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute selected(String value) {
        return attr("selected", value);
    }

    /**
     * Shape attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute shape(String value) {
        return attr("shape", value);
    }

    /**
     * Size attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute size(String value) {
        return attr("size", value);
    }

    /**
     * Sizes attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute sizes(String value) {
        return attr("sizes", value);
    }

    /**
     * Slot attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute slot(String value) {
        return attr("slot", value);
    }

    /**
     * Span attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute span(String value) {
        return attr("span", value);
    }

    /**
     * Spellcheck attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute spellcheck(String value) {
        return attr("spellcheck", value);
    }

    /**
     * Src attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute src(String value) {
        return attr("src", value);
    }

    /**
     * Srcdoc attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute srcdoc(String value) {
        return attr("srcdoc", value);
    }

    /**
     * Srclang attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute srclang(String value) {
        return attr("srclang", value);
    }

    /**
     * Srcset attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute srcset(String value) {
        return attr("srcset", value);
    }

    /**
     * Start attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute start(String value) {
        return attr("start", value);
    }

    /**
     * Step attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute step(String value) {
        return attr("step", value);
    }

    /**
     * Style attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute style(String value) {
        return attr("style", value);
    }

    /**
     * Summary attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute summary(String value) {
        return attr("summary", value);
    }

    /**
     * Tabindex attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute tabindex(String value) {
        return attr("tabindex", value);
    }

    /**
     * Target attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute target(String value) {
        return attr("target", value);
    }

    /**
     * Title attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute title(String value) {
        return attr("title", value);
    }

    /**
     * Translate attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute translate(String value) {
        return attr("translate", value);
    }

    /**
     * Type attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute type(String value) {
        return attr("type", value);
    }

    /**
     * Usemap attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute usemap(String value) {
        return attr("usemap", value);
    }

    /**
     * Value attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute value(String value) {
        return attr("value", value);
    }

    /**
     * Width attribute element.
     *
     * @param value the value
     * @return the attribute element
     */
    static Attribute width(String value) {
        return attr("width", value);
    }

    /**
     * Wrap attribute element.
     *
     * @param value the value
     * @return the attribute element
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
    static Element tag(String name, Element... children) {
        return new Element(name, children);
    }

    // Main root

    /**
     * Html element.
     *
     * @param children the children
     * @return the element
     */
    static Element html(Element... children) {
        return new HtmlDocumentElement(children);
    }

    // Document metadata

    /**
     * Base element.
     *
     * @param children the children
     * @return the element
     */
    static Element base(Element... children) {
        return tag("base", children);
    }

    /**
     * Head element.
     *
     * @param children the children
     * @return the element
     */
    static Element head(Element... children) {
        return tag("head", children);
    }

    /**
     * Link element.
     *
     * @param children the children
     * @return the element
     */
    static Element link(Element... children) {
        return tag("link", children);
    }

    /**
     * Meta element.
     *
     * @param children the children
     * @return the element
     */
    static Element meta(Element... children) {
        return tag("meta", children);
    }

    /**
     * Style element.
     *
     * @param children the children
     * @return the element
     */
    static Element style(Element... children) {
        return tag("style", children);
    }

    /**
     * Title element.
     *
     * @param children the children
     * @return the element
     */
    static Element title(Element... children) {
        return tag("title", children);
    }

    // Sectioning root

    /**
     * Body element.
     *
     * @param children the children
     * @return the element
     */
    static Element body(Element... children) {
        return tag("body", children);
    }

    // Content sectioning


    /**
     * Address element.
     *
     * @param children the children
     * @return the element
     */
    static Element address(Element... children) {
        return tag("address", children);
    }

    /**
     * Article element.
     *
     * @param children the children
     * @return the element
     */
    static Element article(Element... children) {
        return tag("article", children);
    }

    /**
     * Aside element.
     *
     * @param children the children
     * @return the element
     */
    static Element aside(Element... children) {
        return tag("aside", children);
    }

    /**
     * Footer element.
     *
     * @param children the children
     * @return the element
     */
    static Element footer(Element... children) {
        return tag("footer", children);
    }

    /**
     * Header element.
     *
     * @param children the children
     * @return the element
     */
    static Element header(Element... children) {
        return tag("header", children);
    }

    /**
     * H 1 element.
     *
     * @param children the children
     * @return the element
     */
    static Element h1(Element... children) {
        return tag("h1", children);
    }
    /**
     * H 2 element.
     *
     * @param children the children
     * @return the element
     */
    static Element h2(Element... children) {
        return tag("h2", children);
    }

    /**
     * H 3 element.
     *
     * @param children the children
     * @return the element
     */
    static Element h3(Element... children) {
        return tag("h3", children);
    }

    /**
     * H 4 element.
     *
     * @param children the children
     * @return the element
     */
    static Element h4(Element... children) {
        return tag("h4", children);
    }

    /**
     * H 5 element.
     *
     * @param children the children
     * @return the element
     */
    static Element h5(Element... children) {
        return tag("h5", children);
    }

    /**
     * H 6 element.
     *
     * @param children the children
     * @return the element
     */
    static Element h6(Element... children) {
        return tag("h6", children);
    }

    /**
     * Main element.
     *
     * @param children the children
     * @return the element
     */
    static Element main(Element... children) {
        return tag("main", children);
    }

    /**
     * Nav element.
     *
     * @param children the children
     * @return the element
     */
    static Element nav(Element... children) {
        return tag("nav", children);
    }

    /**
     * Section element.
     *
     * @param children the children
     * @return the element
     */
    static Element section(Element... children) {
        return tag("section", children);
    }

    // Text content

    /**
     * Blockquote element.
     *
     * @param children the children
     * @return the element
     */
    static Element blockquote(Element... children) {
        return tag("blockquote", children);
    }

    /**
     * Dd element.
     *
     * @param children the children
     * @return the element
     */
    static Element dd(Element... children) {
        return tag("dd", children);
    }

    /**
     * Div element.
     *
     * @param children the children
     * @return the element
     */
    static Element div(Element... children) {
        return tag("div", children);
    }

    /**
     * Dl element.
     *
     * @param children the children
     * @return the element
     */
    static Element dl(Element... children) {
        return tag("dl", children);
    }

    /**
     * Dt element.
     *
     * @param children the children
     * @return the element
     */
    static Element dt(Element... children) {
        return tag("dt", children);
    }

    /**
     * Figcaption element.
     *
     * @param children the children
     * @return the element
     */
    static Element figcaption(Element... children) {
        return tag("figcaption", children);
    }

    /**
     * Figure element.
     *
     * @param children the children
     * @return the element
     */
    static Element figure(Element... children) {
        return tag("figure", children);
    }

    /**
     * Hr element.
     *
     * @param children the children
     * @return the element
     */
    static Element hr(Element... children) {
        return tag("hr", children);
    }

    /**
     * Li element.
     *
     * @param children the children
     * @return the element
     */
    static Element li(Element... children) {
        return tag("li", children);
    }

    /**
     * Ol element.
     *
     * @param children the children
     * @return the element
     */
    static Element ol(Element... children) {
        return tag("ol", children);
    }

    /**
     * P element.
     *
     * @param children the children
     * @return the element
     */
    static Element p(Element... children) {
        return tag("p", children);
    }

    /**
     * Pre element.
     *
     * @param children the children
     * @return the element
     */
    static Element pre(Element... children) {
        return tag("pre", children);
    }

    /**
     * Ul element.
     *
     * @param children the children
     * @return the element
     */
    static Element ul(Element... children) {
        return tag("ul", children);
    }

    // Inline text semantics

    /**
     * A element.
     *
     * @param children the children
     * @return the element
     */
    static Element a(Element... children) {
        return tag("a", children);
    }

    /**
     * Abbr element.
     *
     * @param children the children
     * @return the element
     */
    static Element abbr(Element... children) {
        return tag("abbr", children);
    }

    /**
     * B element.
     *
     * @param children the children
     * @return the element
     */
    static Element b(Element... children) {
        return tag("b", children);
    }

    /**
     * Bdi element.
     *
     * @param children the children
     * @return the element
     */
    static Element bdi(Element... children) {
        return tag("bdi", children);
    }

    /**
     * Bdo element.
     *
     * @param children the children
     * @return the element
     */
    static Element bdo(Element... children) {
        return tag("bdo", children);
    }

    /**
     * Br element.
     *
     * @param children the children
     * @return the element
     */
    static Element br(Element... children) {
        return tag("br", children);
    }

    /**
     * Cite element.
     *
     * @param children the children
     * @return the element
     */
    static Element cite(Element... children) {
        return tag("cite", children);
    }

    /**
     * Code element.
     *
     * @param children the children
     * @return the element
     */
    static Element code(Element... children) {
        return tag("code", children);
    }

    /**
     * Data element.
     *
     * @param children the children
     * @return the element
     */
    static Element data(Element... children) {
        return tag("data", children);
    }

    /**
     * Dfn element.
     *
     * @param children the children
     * @return the element
     */
    static Element dfn(Element... children) {
        return tag("dfn", children);
    }

    /**
     * Em element.
     *
     * @param children the children
     * @return the element
     */
    static Element em(Element... children) {
        return tag("em", children);
    }

    /**
     * element.
     *
     * @param children the children
     * @return the element
     */
    static Element i(Element... children) {
        return tag("i", children);
    }

    /**
     * Kbd element.
     *
     * @param children the children
     * @return the element
     */
    static Element kbd(Element... children) {
        return tag("kbd", children);
    }

    /**
     * Mark element.
     *
     * @param children the children
     * @return the element
     */
    static Element mark(Element... children) {
        return tag("mark", children);
    }

    /**
     * Q element.
     *
     * @param children the children
     * @return the element
     */
    static Element q(Element... children) {
        return tag("q", children);
    }

    /**
     * Rp element.
     *
     * @param children the children
     * @return the element
     */
    static Element rp(Element... children) {
        return tag("rp", children);
    }

    /**
     * Rt element.
     *
     * @param children the children
     * @return the element
     */
    static Element rt(Element... children) {
        return tag("rt", children);
    }

    /**
     * Ruby element.
     *
     * @param children the children
     * @return the element
     */
    static Element ruby(Element... children) {
        return tag("ruby", children);
    }

    /**
     * S element.
     *
     * @param children the children
     * @return the element
     */
    static Element s(Element... children) {
        return tag("s", children);
    }

    /**
     * Samp element.
     *
     * @param children the children
     * @return the element
     */
    static Element samp(Element... children) {
        return tag("samp", children);
    }

    /**
     * Small element.
     *
     * @param children the children
     * @return the element
     */
    static Element small(Element... children) {
        return tag("small", children);
    }

    /**
     * Span element.
     *
     * @param children the children
     * @return the element
     */
    static Element span(Element... children) {
        return tag("span", children);
    }

    /**
     * Strong element.
     *
     * @param children the children
     * @return the element
     */
    static Element strong(Element... children) {
        return tag("strong", children);
    }

    /**
     * Sub element.
     *
     * @param children the children
     * @return the element
     */
    static Element sub(Element... children) {
        return tag("sub", children);
    }

    /**
     * Sup element.
     *
     * @param children the children
     * @return the element
     */
    static Element sup(Element... children) {
        return tag("sup", children);
    }

    /**
     * Time element.
     *
     * @param children the children
     * @return the element
     */
    static Element time(Element... children) {
        return tag("time", children);
    }

    /**
     * U element.
     *
     * @param children the children
     * @return the element
     */
    static Element u(Element... children) {
        return tag("u", children);
    }

    /**
     * Var element.
     *
     * @param children the children
     * @return the element
     */
    static Element var(Element... children) {
        return tag("var", children);
    }

    /**
     * Wbr element.
     *
     * @param children the children
     * @return the element
     */
    static Element wbr(Element... children) {
        return tag("wbr", children);
    }

    // Image and multimedia

    /**
     * Area element.
     *
     * @param children the children
     * @return the element
     */
    static Element area(Element... children) {
        return tag("area", children);
    }

    /**
     * Audio element.
     *
     * @param children the children
     * @return the element
     */
    static Element audio(Element... children) {
        return tag("audio", children);
    }

    /**
     * Img element.
     *
     * @param children the children
     * @return the element
     */
    static Element img(Element... children) {
        return tag("img", children);
    }

    /**
     * Map element.
     *
     * @param children the children
     * @return the element
     */
    static Element map(Element... children) {
        return tag("map", children);
    }

    /**
     * Track element.
     *
     * @param children the children
     * @return the element
     */
    static Element track(Element... children) {
        return tag("track", children);
    }

    /**
     * Video element.
     *
     * @param children the children
     * @return the element
     */
    static Element video(Element... children) {
        return tag("video", children);
    }

    // Embedded content

    /**
     * Embed element.
     *
     * @param children the children
     * @return the element
     */
    static Element embed(Element... children) {
        return tag("embed", children);
    }

    /**
     * Iframe element.
     *
     * @param children the children
     * @return the element
     */
    static Element iframe(Element... children) {
        return tag("iframe", children);
    }

    /**
     * Object element.
     *
     * @param children the children
     * @return the element
     */
    static Element object(Element... children) {
        return tag("objcet", children);
    }

    /**
     * Param element.
     *
     * @param children the children
     * @return the element
     */
    static Element param(Element... children) {
        return tag("param", children);
    }

    /**
     * Picture element.
     *
     * @param children the children
     * @return the element
     */
    static Element picture(Element... children) {
        return tag("picture", children);
    }

    /**
     * Portal element.
     *
     * @param children the children
     * @return the element
     */
    static Element portal(Element... children) {
        return tag("portal", children);
    }

    /**
     * Source element.
     *
     * @param children the children
     * @return the element
     */
    static Element source(Element... children) {
        return tag("source", children);
    }

    // SVG and MathML

    /**
     * Svg element.
     *
     * @param children the children
     * @return the element
     */
    static Element svg(Element... children) {
        return tag("svg", children);
    }

    /**
     * Math element.
     *
     * @param children the children
     * @return the element
     */
    static Element math(Element... children) {
        return tag("math", children);
    }

    // Scripting

    /**
     * Canvas element.
     *
     * @param children the children
     * @return the element
     */
    static Element canvas(Element... children) {
        return tag("canvas", children);
    }

    /**
     * Noscript element.
     *
     * @param children the children
     * @return the element
     */
    static Element noscript(Element... children) {
        return tag("noscript", children);
    }

    /**
     * Script element.
     *
     * @param children the children
     * @return the element
     */
    static Element script(Element... children) {
        return tag("script", children);
    }

    // Demarcating edits

    /**
     * Del element.
     *
     * @param children the children
     * @return the element
     */
    static Element del(Element... children) {
        return tag("del", children);
    }

    /**
     * Ins element.
     *
     * @param children the children
     * @return the element
     */
    static Element ins(Element... children) {
        return tag("ins", children);
    }

    // Table content

    /**
     * Caption element.
     *
     * @param children the children
     * @return the element
     */
    static Element caption(Element... children) {
        return tag("caption", children);
    }

    /**
     * Col element.
     *
     * @param children the children
     * @return the element
     */
    static Element col(Element... children) {
        return tag("col", children);
    }

    /**
     * Colgroup element.
     *
     * @param children the children
     * @return the element
     */
    static Element colgroup(Element... children) {
        return tag("colgroup", children);
    }

    /**
     * Table element.
     *
     * @param children the children
     * @return the element
     */
    static Element table(Element... children) {
        return tag("table", children);
    }

    /**
     * Tbody element.
     *
     * @param children the children
     * @return the element
     */
    static Element tbody(Element... children) {
        return tag("tbody", children);
    }

    /**
     * Td element.
     *
     * @param children the children
     * @return the element
     */
    static Element td(Element... children) {
        return tag("td", children);
    }

    /**
     * Tfoot element.
     *
     * @param children the children
     * @return the element
     */
    static Element tfoot(Element... children) {
        return tag("tfoot", children);
    }

    /**
     * Th element.
     *
     * @param children the children
     * @return the element
     */
    static Element th(Element... children) {
        return tag("th", children);
    }

    /**
     * Thead element.
     *
     * @param children the children
     * @return the element
     */
    static Element thead(Element... children) {
        return tag("thead", children);
    }

    /**
     * Tr element.
     *
     * @param children the children
     * @return the element
     */
    static Element tr(Element... children) {
        return tag("tr", children);
    }

    // Forms

    /**
     * Button element.
     *
     * @param children the children
     * @return the element
     */
    static Element button(Element... children) {
        return tag("button", children);
    }

    /**
     * Datalist element.
     *
     * @param children the children
     * @return the element
     */
    static Element datalist(Element... children) {
        return tag("datalist", children);
    }

    /**
     * Fieldset element.
     *
     * @param children the children
     * @return the element
     */
    static Element fieldset(Element... children) {
        return tag("fieldset", children);
    }

    /**
     * Form element.
     *
     * @param children the children
     * @return the element
     */
    static Element form(Element... children) {
        return tag("form", children);
    }

    /**
     * Input element.
     *
     * @param children the children
     * @return the element
     */
    static Element input(Element... children) {
        return tag("input", children);
    }

    /**
     * Label element.
     *
     * @param children the children
     * @return the element
     */
    static Element label(Element... children) {
        return tag("label", children);
    }

    /**
     * Legend element.
     *
     * @param children the children
     * @return the element
     */
    static Element legend(Element... children) {
        return tag("legend", children);
    }

    /**
     * Meter element.
     *
     * @param children the children
     * @return the element
     */
    static Element meter(Element... children) {
        return tag("meter", children);
    }

    /**
     * Optgroup element.
     *
     * @param children the children
     * @return the element
     */
    static Element optgroup(Element... children) {
        return tag("optgroup", children);
    }

    /**
     * Option element.
     *
     * @param children the children
     * @return the element
     */
    static Element option(Element... children) {
        return tag("option", children);
    }

    /**
     * Output element.
     *
     * @param children the children
     * @return the element
     */
    static Element output(Element... children) {
        return tag("output", children);
    }

    /**
     * Progress element.
     *
     * @param children the children
     * @return the element
     */
    static Element progress(Element... children) {
        return tag("progress", children);
    }

    /**
     * Select element.
     *
     * @param children the children
     * @return the element
     */
    static Element select(Element... children) {
        return tag("select", children);
    }

    /**
     * Textarea element.
     *
     * @param children the children
     * @return the element
     */
    static Element textarea(Element... children) {
        return tag("textarea", children);
    }

    // Interactive elements

    /**
     * Details element.
     *
     * @param children the children
     * @return the element
     */
    static Element details(Element... children) {
        return tag("details", children);
    }

    /**
     * Dialog element.
     *
     * @param children the children
     * @return the element
     */
    static Element dialog(Element... children) {
        return tag("dialog", children);
    }

    /**
     * Menu element.
     *
     * @param children the children
     * @return the element
     */
    static Element menu(Element... children) {
        return tag("menu", children);
    }

    /**
     * Summary element.
     *
     * @param children the children
     * @return the element
     */
    static Element summary(Element... children) {
        return tag("summary", children);
    }

    /**
     * Slot element.
     *
     * @param children the children
     * @return the element
     */
    static Element slot(Element... children) {
        return tag("slot", children);
    }

    /**
     * Template element.
     *
     * @param children the children
     * @return the element
     */
    static Element template(Element... children) {
        return tag("template", children);
    }
}
