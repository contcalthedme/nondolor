public void onTrigger(final ProcessContext context, final ProcessSession session) throws ProcessException {
    FlowFile ff = session.get();
    session.read(ff, new InputStreamCallback() {
        @Override
        public void process(InputStream in) throws IOException {
            // Process the InputStream here
        }
    });
}
