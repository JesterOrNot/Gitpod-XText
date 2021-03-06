FROM gitpod/workspace-full-vnc

USER gitpod

# Install Eclipse deps
RUN sudo apt-get update \
    && sudo apt-get install -y \
        default-jre \
        libxtst-dev

# Install Eclipse
RUN wget "http://eclipse.mirror.rafal.ca/oomph/epp/2019-12/R/eclipse-inst-linux64.tar.gz" \
    && tar -xf *.tar.gz \
    && mv eclipse-installer /tmp

RUN wget "http://mirrors.xmission.com/eclipse/technology/epp/downloads/release/2020-03/R/eclipse-dsl-2020-03-R-linux-gtk-x86_64.tar.gz" \
    && tar xfvz eclipse-dsl-2020-03-R-linux-gtk-x86_64.tar.gz
